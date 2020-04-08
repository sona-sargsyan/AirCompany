package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class B_2_Spirit extends MilitaryPlane {

    public B_2_Spirit() {
        model = "B 2 Spirit";
        maxSpeed = 1030;
        maxFlightDistance = 22000;
        maxLoadCapacity = 70000;
        militaryType = MilitaryTypes.BOMBER;
    }

}
