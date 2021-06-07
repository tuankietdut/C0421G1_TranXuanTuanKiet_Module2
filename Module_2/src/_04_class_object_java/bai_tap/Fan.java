package _04_class_object_java.bai_tap;

public class Fan {
    public static void main(String[] args) {
        Fan objectOne = new Fan();
        System.out.println(objectOne.fanToString());
        Fan objectTwo = new Fan();
        objectTwo.setOn(true);
        objectTwo.setColor("yellow");
        objectTwo.setRadius(10);
        objectTwo.setSpeed(3);
        System.out.println(objectTwo.fanToString());
    }
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius =5;
    private String color = "Blue";
    public Fan(){}
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public int getSpeed() {
        if (this.speed ==1){
            return SLOW;
        } else if (this.speed==2){
            return MEDIUM;
        } else {
            return FAST;
        }
    }
    public String getColor() {
        return color;
    }
    public boolean getOn(){
        return on;
    }
    public String fanToString(){
        if (this.on){
            return  "fan is on "+ "color: " + this.getColor() + "; speed: " + this.getSpeed() + "; radius: " + this.getRadius();
        }else {
            return  "fan is off "+ "color: " + this.getColor() + "; radius: " + this.getRadius();
        }
    }
}
