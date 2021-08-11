public class Trapezium {
	float length1;
	float length2;
	float height;
	float area;
	
	public Trapezium(float length1,float length2,float height) {
		this.length1= length1;
		this.length2= length2;
		this.height= height;
	}

	public float getLength1() {
		return length1;
	}

	public void setLength1(float length1) {
		this.length1 = length1;
	}

	public float getLength2() {
		return length2;
	}

	public void setLength2(float length2) {
		this.length2 = length2;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public void calculateArea() {
		area = (length1+length2)/2*height;
	}

}
