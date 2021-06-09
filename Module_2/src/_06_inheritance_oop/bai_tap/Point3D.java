package _06_inheritance_oop.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    public static void main(String[] args) {
        Point3D test = new Point3D(2,4,3);
        System.out.println(Arrays.toString(test.getXYZ()));
    }
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z){
        setY(y);
        setX(x);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arrPoint3D = {getX(), getY(), this.z};
        return arrPoint3D;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
