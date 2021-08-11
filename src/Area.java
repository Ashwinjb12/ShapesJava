import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please tell what you want-");
		System.out.println("Option 1 - Area of Circle");
		System.out.println("Option 2 - Area of Rectangle");
		System.out.println("Option 3 - Area of Square");
		System.out.println("Option 4 - Area of Triangle");
		System.out.println("Option 5 - Area of Parallelogram");
		System.out.println("Option 6 - Area of Trapezium");
		System.out.println("Option 7 - Area of Ellipse");
		
		option = scanner.nextInt();
		
		if (option == 1) {
			System.out.println("Please input the radius of the circle:");
			float radius  = scanner.nextFloat();
				
			Circle c = new Circle(radius);
			c.calculateArea();
			System.out.println("Circle area is : " + c.getArea());
		} else if (option == 2 ) {
			System.out.println("Please input the length of the rectangle:");
			float length  = scanner.nextFloat();
			System.out.println("Please input the breadth of the rectangle:");
			float breadth = scanner.nextFloat();
				
			Rectangle r = new Rectangle(length,breadth);
			r.calculateArea();
			System.out.println("Rectangle area is : " + r.getArea());
		} else if (option == 3) {
			System.out.println("Please input the side of the square:");
			float side  = scanner.nextFloat();
				
			Square s = new Square(side);
			s.calculateArea();
			System.out.println("Square area is : " + s.getArea());
		} else  if (option == 4){
			System.out.println("Please input the base of the triangle:");
			float base  = scanner.nextFloat();
			System.out.println("Please input the height of the triangle:");
			float height  = scanner.nextFloat();
			
				
			Triangle t = new Triangle(base,height);
			t.calculateArea();
			System.out.println("Triangle area is : " + t.getArea());
		} else if (option == 5) {
			System.out.println("Please input the base of the parallelogram:");
			float base  = scanner.nextFloat();
			System.out.println("Please input the height of the parallelogram:");
			float height  = scanner.nextFloat();
			
				
			Parallelogram p = new Parallelogram(base,height);
			p.calculateArea();
			System.out.println("Parallelogram area is : " + p.getArea());
		} else if(option == 6) {
			System.out.println("Please input the length1 of the parallelogram:");
			float length1  = scanner.nextFloat();
			System.out.println("Please input the length2 of the parallelogram:");
			float length2  = scanner.nextFloat();
			System.out.println("Please input the height of the parallelogram:");
			float height  = scanner.nextFloat();
			
				
			Trapezium t = new  Trapezium(length1,length2,height);
			t.calculateArea();
			System.out.println("Trapezium area is : " + t.getArea());
		}else if (option == 7){
			System.out.println("Please input the majorAxis value of the Ellipse:");
			float majorAxis  = scanner.nextFloat();
			System.out.println("Please input the minorAxis value of the Ellipse:");
			float minorAxis  = scanner.nextFloat();
			
			Ellipse e = new  Ellipse(majorAxis,minorAxis);
			e.calculateArea();
			System.out.println("Ellipse area is : " + e.getArea());
		} else {
			System.out.println("Invalid Option............");
		}
	} while (1==1);
		
}		

}
