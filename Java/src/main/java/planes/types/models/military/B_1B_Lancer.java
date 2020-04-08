package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class B_1B_Lancer extends MilitaryPlane {

    public B_1B_Lancer() {
        model = "B 1B Lancer";
        maxSpeed = 10500;
        maxFlightDistance = 21000;
        maxLoadCapacity = 80000;
        militaryType = MilitaryTypes.BOMBER;
    }

}
