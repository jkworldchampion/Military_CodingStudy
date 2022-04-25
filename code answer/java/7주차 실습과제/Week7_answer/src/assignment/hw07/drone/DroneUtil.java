package assignment.hw07.drone;

import java.util.List;

public class DroneUtil {
    private DroneUtil() {
    }

    public static boolean isOverlap(Drone a, Drone b) {
        return calculateDistance(a, b) < (a.getSearchRange() + b.getSearchRange());
    }

    public static double calculateCoverage(Drone a) {
        return Math.pow(a.getSearchRange(), 2) * Math.PI;
    }

    public static double calculateDistance(Drone a, Drone b) {
        return calculateDistance(a.getPosition(), b.getPosition());
    }

    public static double calculateDistance(Point a, Point b) {
        return Math.sqrt(
                Math.pow(a.getPositionX() - b.getPositionX(), 2) + Math.pow(a.getPositionY() - b.getPositionY(), 2));
    }

    public static Drone getMostClosestTargetDrone(List<Drone> droneList) {
        Drone closestDrone = droneList.get(0);

        for (Drone drone : droneList) {
            if (calculateDistance(drone.getPosition(), Drone.getTarget()) < calculateDistance(
                    closestDrone.getPosition(),
                    Drone.getTarget())) {
                closestDrone = drone;
            }
        }

        return closestDrone;
    }
}
