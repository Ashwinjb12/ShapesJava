public class Square {
	float side;
	float area;
	
	public Square(float side) {
		this.side = side;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	public void calculateArea() {
		area = side * side;
	}

	
}