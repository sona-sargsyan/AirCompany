package planes.types.models.passenger;

import planes.types.PassengerPlane;

public class Boeing_747 extends PassengerPlane {

    public Boeing_747() {
        model = "Boeing-747";
        maxSpeed = 980;
        maxFlightDistance = 16100;
        maxLoadCapacity = 70500;
        passengersCapacity = 242;
    }

}
