public class Triangle {
	float base;
	float height;
	float area;
	
	public Triangle(float base,float height) {
		this.base = base;
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
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
		area = (base * height)/2;
	}
}
