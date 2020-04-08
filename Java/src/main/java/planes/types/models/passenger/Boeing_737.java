package planes.types.models.passenger;

import planes.types.PassengerPlane;

public class Boeing_737 extends PassengerPlane {

    public Boeing_737() {
        model = "Boeing-737";
        maxSpeed = 900;
        maxFlightDistance = 12000;
        maxLoadCapacity = 60500;
        passengersCapacity = 164;
    }

}
