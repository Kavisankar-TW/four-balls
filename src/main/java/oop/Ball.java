package oop;

public class Ball {
    public static final int DIAMETER = 10;

    private int xCoordinate;
    private final int yCoordinate;
    private final int speed;

    public Ball(int yCoordinate, int speed) {
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void move() {
        xCoordinate += speed;
    }
}
