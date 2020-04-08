package planes.types.models.experimental;

import models.ClassificationLevels;
import models.ExperimentalTypes;
import planes.types.ExperimentalPlane;

public class Bell_X_14 extends ExperimentalPlane {

    public Bell_X_14() {
        model = "Bell X-14";
        maxSpeed = 277;
        maxFlightDistance = 480;
        maxLoadCapacity = 500;
        experimentalTypes = ExperimentalTypes.HIGH_ALTITUDE;
        classificationLevel = ClassificationLevels.SECRET;
    }

}
