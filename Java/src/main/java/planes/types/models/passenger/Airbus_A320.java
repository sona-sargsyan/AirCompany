package planes.types.models.passenger;

import planes.types.PassengerPlane;

public class Airbus_A320 extends PassengerPlane {

    public Airbus_A320() {
        model = "Airbus A320";
        maxSpeed = 930;
        maxFlightDistance = 11800;
        maxLoadCapacity = 65500;
        passengersCapacity = 188;
    }

}
