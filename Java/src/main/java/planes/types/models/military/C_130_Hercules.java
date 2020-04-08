package planes.types.models.military;

import models.MilitaryTypes;
import planes.types.MilitaryPlane;

public class C_130_Hercules extends MilitaryPlane {

    public C_130_Hercules() {
        model = "C 130 Hercules";
        maxSpeed = 650;
        maxFlightDistance = 5000;
        maxLoadCapacity = 110000;
        militaryType = MilitaryTypes.TRANSPORT;
    }

}
