import core.Line;
import core.Station;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



@DisplayName("Проверка всех методов класса RouteCalculator")
public class TestRouteCalculator extends TestCase {

    List<Station> testRoute;
    StationIndex index = new StationIndex();
    Line line1 = new Line(1, "LineOne");
    Line line2 = new Line(2, "LineTwo");
    Line line3 = new Line(3, "LineThree");
    Station one = new Station ("StationOne", line1);
    Station two = new Station ("StationTwo", line1);
    Station three = new Station ("StationThree", line2);
    Station four = new Station ("StationFour", line2);
    Station five = new Station ("StationFive", line3);


    protected void setUp() throws Exception {
        index.addLine(line1);
        index.addLine(line2);
        index.addLine(line3);
        index.addStation(one);
        index.addStation(two);
        index.addStation(three);
        index.addStation(four);
        index.addStation(five);

        testRoute = new ArrayList<>();

        testRoute.add(new Station ("StationOne", line1));
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
        List <Station> oneTransferList = new ArrayList<>();
        RouteCalculator test = new RouteCalculator(index);
        oneTransferList = test.getShortestRoute(one, four);
        double actual = RouteCalculator.calculateDuration(oneTransferList);
        double expected = 8.5;
        assertEquals(actual, expected);
    }
}
