package week_4;
import java.util.*;

public class DroneManager {
    private List<Drone> droneList = new ArrayList<>();
    
    public void addDrone(Drone drone){
        droneList.add(drone);
    }
    
    public void removeDrone(String droneCode){
        int count = 0;
        for (Drone i : droneList){
            if (i.getDroneCode().equals(droneCode)){
                droneList.remove(count);
                break;
            } else { count += 1; }
        }
    }
    
    public void removeDrone(int index){
        droneList.remove(index);
    }
    
    public Drone getDrone(String droneCode){
        int count = 0;
        for (Drone i : droneList){
            if (i.getDroneCode().equals(droneCode)){
                break;
            } else { count += 1; }
        }
        return droneList.get(count);
    }
    
    public Drone getDrone(int index){
        return droneList.get(index);
    }
    
    public ArrayList getDroneList(){
        return droneList;
    }
}
