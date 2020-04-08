import models.ClassificationLevels;
import models.MilitaryTypes;
import planes.BasePlane;
import planes.types.ExperimentalPlane;
import planes.types.MilitaryPlane;

import java.util.List;

public class TestHelper {

    public boolean isMilitaryPlaneDefinedTypeOnly(List<MilitaryPlane> transportMilitaryPlanes, MilitaryTypes militaryType) {
        return transportMilitaryPlanes
                .stream()
                .map(MilitaryPlane::getMilitaryType)
                .allMatch(planeType -> planeType.equals(militaryType));
    }

    public boolean hasNotExperimentalPlanesDefinedClassificationLevel(List<ExperimentalPlane> experimentalPlanes, ClassificationLevels notExpectedClassificationLevel) {
        return experimentalPlanes
                .stream()
                .map(ExperimentalPlane::getClassificationLevel)
                .noneMatch(actualClassificationLevel -> actualClassificationLevel.equals(notExpectedClassificationLevel));
    }

    public boolean isSortedByMaxLoadCapacity(List<? extends BasePlane> planeList) {
        for (int i = 0; i < planeList.size() - 1; i++) {
            if (planeList.get(i).getMaxLoadCapacity() > planeList.get(i + 1).getMaxLoadCapacity()) {
                return false;
            }

        }
        return true;
    }
}
