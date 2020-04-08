package main;

import models.MilitaryTypes;
import planes.BasePlane;
import planes.types.ExperimentalPlane;
import planes.types.MilitaryPlane;
import planes.types.PassengerPlane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends BasePlane> planes;

    public Airport(List<? extends BasePlane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlaneArrayList = new ArrayList<>();
        for (BasePlane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlaneArrayList.add((PassengerPlane) plane);
            }
        }
        return passengerPlaneArrayList;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanesArrayList = new ArrayList<>();
        for (BasePlane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanesArrayList.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanesArrayList;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getMilitaryPlanesByDefinedArgument(MilitaryTypes militaryType) {
        List<MilitaryPlane> MilitaryPlanesArrayList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getMilitaryType() == militaryType) {
                MilitaryPlanesArrayList.add(plane);
            }
        }
        return MilitaryPlanesArrayList;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanesArrayList = new ArrayList<>();
        for (BasePlane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanesArrayList.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanesArrayList;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
       return getMilitaryPlanesByDefinedArgument(MilitaryTypes.TRANSPORT);
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return getMilitaryPlanesByDefinedArgument(MilitaryTypes.BOMBER);
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<BasePlane>() {
            public int compare(BasePlane o1, BasePlane o2) {
                return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<BasePlane>() {
            public int compare(BasePlane o1, BasePlane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<BasePlane>() {
            public int compare(BasePlane o1, BasePlane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends BasePlane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "main.Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}
