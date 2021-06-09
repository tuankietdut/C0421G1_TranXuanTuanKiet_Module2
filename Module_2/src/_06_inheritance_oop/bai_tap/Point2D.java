package _06_inheritance_oop.bai_tap;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] arrPoint = new float[2];
        arrPoint[0] = this.x;
        arrPoint[1] = this.y;
        return arrPoint;
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
