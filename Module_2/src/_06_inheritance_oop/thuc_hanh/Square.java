package _06_inheritance_oop.thuc_hanh;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double size) {
        super(size, size);
    }
    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }
    public void setSide(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    public double getSide(){
        return super.getWidth();
    }
    @Override
    public void setWidth(double size) {
        setSide(size);
    }
    public void setLength(double size) {
        setSide(size);
    }
    @Override
    public String toString() {
        return "A Square with size= "+super.getWidth()+", which a subclass of"+ super.toString();
    }
}
