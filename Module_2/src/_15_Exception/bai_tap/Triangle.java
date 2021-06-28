package _15_Exception.bai_tap;


public class Triangle {

    private int edgeOne = 0;
    private int edgeTwo = 0;
    private int edgeThree = 0;

    public Triangle(int edgeOne, int edgeTwo, int edgeThree) {
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
    }

    public Triangle() {
    }

    public int getEdgeOne() {
        return edgeOne;
    }

    public void setEdgeOne(int edgeOne) {
        this.edgeOne = edgeOne;
    }

    public int getEdgeTwo() {
        return edgeTwo;
    }

    public void setEdgeTwo(int edgeTwo) {
        this.edgeTwo = edgeTwo;
    }

    public int getEdgeThree() {
        return edgeThree;
    }

    public void setEdgeThree(int edgeThree) {
        this.edgeThree = edgeThree;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeOne=" + edgeOne +
                ", edgeTwo=" + edgeTwo +
                ", edgeThree=" + edgeThree +
                '}';
    }

}
