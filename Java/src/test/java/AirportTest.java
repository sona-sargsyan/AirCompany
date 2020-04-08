import main.Airport;
import models.ClassificationLevels;
import models.MilitaryTypes;
import org.testng.Assert;
import org.testng.annotations.Test;
import planes.BasePlane;
import planes.types.ExperimentalPlane;
import planes.types.MilitaryPlane;
import planes.types.PassengerPlane;
import planes.types.models.experimental.Bell_X_14;
import planes.types.models.experimental.Ryan_X_13_Vertijet;
import planes.types.models.military.*;
import planes.types.models.passenger.*;

import java.util.Arrays;
import java.util.List;

public class AirportTest {
    private static List<BasePlane> planes = Arrays.asList(
            new Boeing_737(),
            new Boeing_737_800(),
            new Boeing_747(),
            new Airbus_A320(),
            new Airbus_A330(),
            new Embraer_190(),
            new Sukhoi_Superjet_100(),
            new Bombardier_CS300(),
            new B_1B_Lancer(),
            new B_2_Spirit(),
            new B_52_Stratofortress(),
            new F_15(),
            new F_22(),
            new C_130_Hercules(),
            new Bell_X_14(),
            new Ryan_X_13_Vertijet()
    );

    Airport airport = new Airport(planes);
    TestHelper testHelper = new TestHelper();

    @Test
    public void testHasOnlyTransportInMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        Assert.assertTrue(testHelper.isMilitaryPlaneDefinedTypeOnly(transportMilitaryPlanes, MilitaryTypes.TRANSPORT));
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertEquals(new Boeing_747(), expectedPlaneWithMaxPassengersCapacity);
    }

    @Test
    public void testSortByMaxLoadCapacity() {
        airport.sortByMaxLoadCapacity();
        List<? extends BasePlane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        Assert.assertTrue(testHelper.isSortedByMaxLoadCapacity(planesSortedByMaxLoadCapacity));
    }

    @Test
    public void testHasOnlyBomberInMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        Assert.assertTrue(testHelper.isMilitaryPlaneDefinedTypeOnly(bomberMilitaryPlanes, MilitaryTypes.BOMBER));
    }

    @Test
    public void testHasNotUnclassifiedClassificationLevelInExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        Assert.assertTrue(testHelper.hasNotExperimentalPlanesDefinedClassificationLevel(experimentalPlanes, ClassificationLevels.UNCLASSIFIED));
    }
}
