import core.Line;
import core.Station;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Проверка всех методов класса RouteCalculator")
public class TestRouteCalculator {

    List<Station> testRoute;

    @BeforeEach
    protected void setUp() throws Exception {

        testRoute = new ArrayList<>();

        Line line1 = new Line(1, "LineOne");
        Line line2 = new Line(2, "LineTwo");
        Line line3 = new Line(3, "LineThree");

        testRoute.add(new Station("StationOne", line1));
        testRoute.add(new Station("StationTwo", line1));
        testRoute.add(new Station("StationThree", line2));
        testRoute.add(new Station("StationFour", line2));
        testRoute.add(new Station("StationFive", line3));
    }

    @Test
    @DisplayName("Тест с двумя пересадками")
    public void testCalculateDurationWithTwoTransfers() {
        double actual = RouteCalculator.calculateDuration(testRoute);
        double expected = 12.0;
        assertEquals(actual, expected);
    }


    @Test
    @DisplayName("Тест с одной пересадкой")
    public void testCalculateDurationWithOneTransfer() {
        testRoute.remove(4);
        double actual = RouteCalculator.calculateDuration(testRoute);
        double expected = 8.5;
        assertEquals(actual, expected);
    }
}
