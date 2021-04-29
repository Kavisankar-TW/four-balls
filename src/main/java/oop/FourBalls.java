package oop;

import processing.core.PApplet;

public class FourBalls extends PApplet{
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;


    private final Ball[] balls;

    public FourBalls() {
        balls = new Ball[4];
        for(int ballIndex=0; ballIndex<balls.length; ballIndex++){
            int ballNumber = ballIndex + 1;
            balls[ballIndex] = new Ball(WINDOW_HEIGHT * ballNumber / 5 , ballNumber);
        }
    }

    public static void main(String[] args) {
        PApplet.main("oop.FourBalls", args);
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
        drawBalls();
        moveBalls();
    }

    private void drawBalls() {
        for(Ball ball: balls){
            ellipse(ball.getXCoordinate(), ball.getYCoordinate(), Ball.DIAMETER, Ball.DIAMETER);
        }
    }

    private void moveBalls() {
        for(Ball ball: balls){
            ball.move();
        }
    }
}
