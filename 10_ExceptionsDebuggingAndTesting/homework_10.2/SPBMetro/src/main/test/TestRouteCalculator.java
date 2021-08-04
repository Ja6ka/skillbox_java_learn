import core.Line;
import core.Station;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;


public class TestRouteCalculator extends TestCase {

    StationIndex index = new StationIndex();
    Line line1 = new Line(1, "LineOne");
    Line line2 = new Line(2, "LineTwo");
    Line line3 = new Line(3, "LineThree");
    Station one = new Station("StationOne", line1);
    Station two = new Station("StationTwo", line1);
    Station three = new Station("StationThree", line2);
    Station four = new Station("StationFour", line2);
    Station five = new Station("StationFive", line3);
    Station six = new Station("StationSix", line3);

    protected void setUp() throws Exception {
        List<Station> firstConnect = Arrays.asList(two, three);
        List<Station> secondConnect = Arrays.asList(four, five);

        index.addLine(line1);
        index.addLine(line2);
        index.addLine(line3);
        index.addStation(one);
        index.addStation(two);
        index.addStation(three);
        index.addStation(four);
        index.addStation(five);
        index.addStation(six);

        index.addConnection(firstConnect);
        index.addConnection(secondConnect);

    }


    public void testCalculateDurationWithOneTransfer() {
        List<Station> oneTransferList;
        RouteCalculator calc = new RouteCalculator(index);
        oneTransferList = calc.getShortestRoute(index.getStation("StationOne"), index.getStation("StationFour"));
        double actual = RouteCalculator.calculateDuration(oneTransferList);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    public void testCalculateDurationWithTwoTransfers() {
        RouteCalculator calc = new RouteCalculator(index);
        List<Station> twoTransferList = calc.getShortestRoute(index.getStation("StationOne"), index.getStation("StationSix"));
        double expected = 14.5;
        double actual = RouteCalculator.calculateDuration(twoTransferList);
        assertEquals(expected, actual);
    }
}
