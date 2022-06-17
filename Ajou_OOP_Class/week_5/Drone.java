package week_5;

public class Drone {
    private String droneCode;
    private int searchRange;
    Point position = new Point();
    static Point target = new Point(); 
    
    public void setPosition(int x, int y){
        position.setPosition(x, y);
    }
    
    public Point getPoint(){
        return this.position;
    }
    
    public String getDroneCode(){
        return this.droneCode;
    }
    
    public int getSearchRange(){
        return this.searchRange;
    }
    
    public boolean isTargetInRange(){
        int range = ((this.position.getPositionX()-target.getPositionX()^2+
                     (this.position.getPositionY()-target.getPositionY()^2))^(1/2));
        if (range>this.searchRange){
            return false;
        } else { return true; }
    }
    
    public double TargetRange(){
        return ((this.position.getPositionX()-target.getPositionX())^2+
                (this.position.getPositionY()-target.getPositionY())^2)^(1/2);
    }
                     
    public void setTargetPosition(int x, int y){
        this.target.setPosition(x, y);
    }
}
