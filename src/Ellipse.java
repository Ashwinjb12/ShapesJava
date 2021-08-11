public class Ellipse {
	private float majorAxis;
	private float minorAxis;
	private float pi = (float) 3.14;
	private float area ;
	
	public Ellipse(float majorAxis,float minorAxis) {
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}

	public float getMajorAxis() {
		return majorAxis;
	}

	public void setMajorAxis(float majorAxis) {
		this.majorAxis = majorAxis;
	}

	public float getMinorAxis() {
		return minorAxis;
	}

	public void setMinorAxis(float minorAxis) {
		this.minorAxis = minorAxis;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public void calculateArea() {
		area = pi * majorAxis * minorAxis;
	}
}
