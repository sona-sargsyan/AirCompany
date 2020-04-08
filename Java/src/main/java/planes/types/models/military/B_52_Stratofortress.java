package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class B_52_Stratofortress extends MilitaryPlane {

    public B_52_Stratofortress() {
        model = "B 52 Stratofortress";
        maxSpeed = 1000;
        maxFlightDistance = 20000;
        maxLoadCapacity = 80000;
        militaryType = MilitaryTypes.BOMBER;
    }

}
