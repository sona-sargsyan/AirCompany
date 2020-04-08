import main.Airport;
import planes.BasePlane;
import planes.types.models.military.*;
import planes.types.models.passenger.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<BasePlane> planes = Arrays.asList(
            new Boeing_737(),
            new Boeing_737_800(),
            new Boeing_747(),
            new Airbus_A320(),
            new Airbus_A330(),
            new Embraer_190(),
            new Sukhoi_Superjet_100(),
            new Bombardier_CS300(),
            new B_1B_Lancer(),
            new B_2_Spirit(),
            new B_52_Stratofortress(),
            new F_15(),
            new F_22(),
            new C_130_Hercules()
    );

    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlane());
        System.out.println("Military airport sorted by max distance: " + militaryAirport
                .sortByMaxDistance()
                .toString());
        System.out.println("Passenger airport sorted by max speed: " + passengerAirport
                .sortByMaxSpeed()
                .toString());

        System.out.println("Plane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());
    }
}
