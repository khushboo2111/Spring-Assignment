package sampleproject2;

import org.springframework.stereotype.Component;

@Component
public class Triangle{
	

	private float side1;
	
	private float side2;
	
	private float side3;
	
	public Triangle(int i, int j, int k) {
		this.side1 = i;
		this.side2 = i;
		this.side3 = i;
	}
	public float getSide1() {
		return side1;
	}
	public void setSide1(float side1) {
		this.side1 = side1;
	}
	public float getSide2() {
		return side2;
	}
	public void setSide2(float side2) {
		this.side2 = side2;
	}
	public float getSide3() {
		return side3;
	}
	public void setSide3(float side3) {
		this.side3 = side3;
	}
	
	public static float calculatePerimeter(float side1, float side2, float side3) {
		float total = side1 + side2 + side3;
		return total;
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
}
	