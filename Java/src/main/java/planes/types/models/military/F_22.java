package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class F_22 extends MilitaryPlane {

    public F_22() {
        model = "F 22";
        maxSpeed = 1550;
        maxFlightDistance = 13000;
        maxLoadCapacity = 11000;
        militaryType = MilitaryTypes.FIGHTER;
    }

}
