package procedural;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    private static final int DIAMETER_OF_BALL = 10;

    int speedOfBalls[] = {1, 2, 3, 4};
    int yCoordinateOfBalls[] = {WINDOW_HEIGHT / 5, WINDOW_HEIGHT * 2 / 5, WINDOW_HEIGHT * 3 / 5, WINDOW_HEIGHT * 4 / 5};
    int xCoordinateOfBalls[] = {0, 0, 0, 0};

    public static void main(String[] args) {
        PApplet.main("procedural.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        setWindowSize();
    }

    private void setWindowSize() {
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        drawFourBalls();
        moveFourBalls();
    }

    private void drawFourBalls() {
        for(int ballIndex = 0; ballIndex < 4; ballIndex++){
            drawBall(ballIndex);
        }
    }

    private void drawBall(int ballIndex) {
        ellipse(xCoordinateOfBalls[ballIndex], yCoordinateOfBalls[ballIndex], DIAMETER_OF_BALL, DIAMETER_OF_BALL);
    }

    private void moveFourBalls() {
        for(int ballIndex = 0; ballIndex < 4; ballIndex++){
            moveBall(ballIndex);
        }
    }

    private void moveBall(int ballIndex) {
        xCoordinateOfBalls[ballIndex] += speedOfBalls[ballIndex];
    }
}
