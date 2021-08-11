public class Circle {
	
	private float radius;
	private float area;
	private float pi = (float) 3.14;
	
	public Circle (float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getPi() {
		return pi;
	}
	public void setPi(float pi) {
		this.pi = pi;
	}
	
	public void calculateArea() {
		area = pi * radius * radius;
}
	
}