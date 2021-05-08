import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(findPlanesLeavingInTheNextTwoHours(airport));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        List<Flight> nextTwoHourDepartures = new ArrayList<>();
        Date currentDate = new Date();
        Date plusTwoHoursDate = new Date();
        plusTwoHoursDate.setHours(currentDate.getHours() + 2);

        airport.getTerminals().forEach(terminal -> terminal.getFlights().stream()
                .filter(t -> t.getType().equals(Flight.Type.DEPARTURE))
                .filter(t -> t.getDate().after(currentDate) && t.getDate().before(plusTwoHoursDate))
                .forEach(nextTwoHourDepartures::add));
        return nextTwoHourDepartures;
    }
}