package planes.types;

import models.ClassificationLevels;
import models.ExperimentalTypes;
import planes.BasePlane;

public abstract class ExperimentalPlane extends BasePlane {

    protected ExperimentalTypes experimentalTypes;
    protected ClassificationLevels classificationLevel;

    public ClassificationLevels getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
