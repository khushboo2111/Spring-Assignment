package AOP;

public class Triangle {

    private float side1;
    private float side2;
    private float side3;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
