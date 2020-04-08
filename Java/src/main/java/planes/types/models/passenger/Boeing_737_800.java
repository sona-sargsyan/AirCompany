package planes.types.models.passenger;

import planes.types.PassengerPlane;

public class Boeing_737_800 extends PassengerPlane {

    public Boeing_737_800() {
        model = "Boeing-737-800";
        maxSpeed = 940;
        maxFlightDistance = 12300;
        maxLoadCapacity = 63870;
        passengersCapacity = 192;
    }

}
