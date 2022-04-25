package hw04;

public class Drone {
    private int positionX;
    private int positionY;
    private String droneCode;

    public Drone(int positionX, int positionY, String droneCode) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.droneCode = droneCode;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getDroneCode() {
        return droneCode;
    }

    public void setPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }

    @Override
    public String toString() {
        return String.format("drone code: %10s  x: %2d  y: %2d", droneCode, positionX, positionY);
    }
}
