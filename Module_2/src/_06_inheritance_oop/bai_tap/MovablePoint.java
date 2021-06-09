// Em không làm lớp Point vì em thấy lớp MovablePoint hoàn toàn kế thừa lớp Point2D
package _06_inheritance_oop.bai_tap;

import java.util.Arrays;

public class MovablePoint extends Point2D {
    public static void main(String[] args) {
        MovablePoint test = new MovablePoint(4,5,1,1);
        System.out.println(test.move());
        System.out.println(Arrays.toString(test.getSpeed()));
       
    }

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = new float[2];
        arrSpeed[0] = this.xSpeed;
        arrSpeed[1] = this.ySpeed;
        return arrSpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
    public MovablePoint move (){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

}
