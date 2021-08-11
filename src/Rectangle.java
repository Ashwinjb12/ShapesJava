public class Rectangle {
	float length;
	float breadth;
	float area;
	
	public Rectangle (float length,float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public void calculateArea() {
		area = length * breadth;
	}
	
}