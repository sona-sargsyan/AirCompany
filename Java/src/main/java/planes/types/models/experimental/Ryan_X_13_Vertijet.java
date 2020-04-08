package planes.types.models.experimental;

import models.ClassificationLevels;
import models.ExperimentalTypes;
import planes.types.ExperimentalPlane;

public class Ryan_X_13_Vertijet extends ExperimentalPlane {

    public Ryan_X_13_Vertijet() {
        model = "Ryan X-13 Vertijet";
        maxSpeed = 560;
        maxFlightDistance = 307;
        maxLoadCapacity = 500;
        experimentalTypes = ExperimentalTypes.VTOL;
        classificationLevel = ClassificationLevels.TOP_SECRET;
    }

}
