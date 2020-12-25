import com.skillbox.airport.Airport;
import java.util.*;
public class Main {



    public static void main(String[] args) {
        Airport koltsovo = Airport.getInstance();
        System.out.println(koltsovo.getAllAircrafts());
        int aircraftsCount = koltsovo.getAllAircrafts().size();
        System.out.println("Количество самолётов в Кольцово: " + aircraftsCount);

    }
}
