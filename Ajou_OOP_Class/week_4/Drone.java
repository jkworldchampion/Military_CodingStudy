package week_4;

public class Drone {
    private int positionX;
    private int positionY;
    private String droneCode;
    
    public Drone(int positionX, int positionY, String droneCode){
        this.positionX = positionX;
        this.positionY = positionY;
        this.droneCode = droneCode;
    }
    
    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
    public String getDroneCode(){
        return this.droneCode;
    }
    
    public void setPosition(int x, int y){
        this.positionX = x;
        this.positionY = y;
    }
}
