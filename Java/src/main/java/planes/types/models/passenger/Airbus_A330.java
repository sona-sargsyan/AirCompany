package planes.types.models.passenger;

import planes.types.PassengerPlane;

public class Airbus_A330 extends PassengerPlane {

    public Airbus_A330() {
        model = "Airbus A330";
        maxSpeed = 990;
        maxFlightDistance = 14800;
        maxLoadCapacity = 80500;
        passengersCapacity = 222;
    }

}
