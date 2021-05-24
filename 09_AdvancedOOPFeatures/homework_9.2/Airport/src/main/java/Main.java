import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(findPlanesLeavingInTheNextTwoHours(airport));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime plusTwoHoursTime = LocalDateTime.now().plusHours(2);
        List<Flight> nextTwoHourDepartures = new ArrayList<>();

        airport.getTerminals().stream().flatMap(t -> t.getFlights()
                .stream()).filter(
                f -> f.getType() == Flight.Type.DEPARTURE &&
                        toLocalDateTime(f.getDate()).isBefore(plusTwoHoursTime) &&
                        toLocalDateTime(f.getDate()).isAfter(currentTime)
                                 )
                .forEach(nextTwoHourDepartures::add);
        return nextTwoHourDepartures;
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}