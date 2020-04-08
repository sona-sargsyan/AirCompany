package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class F_15 extends MilitaryPlane {

    public F_15() {
        model = "F 15";
        maxSpeed = 1500;
        maxFlightDistance = 12000;
        maxLoadCapacity = 10000;
        militaryType = MilitaryTypes.FIGHTER;
    }

}
