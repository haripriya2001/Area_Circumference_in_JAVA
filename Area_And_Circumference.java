import java.util.Scanner;

public class Area_And_Circumference {

	public static void main(String[] args) {
		float radius, circumference;
		double area; 
		System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
		Scanner s = new Scanner(System.in);
		radius = s.nextFloat();
		area = 3.14f*(Math.pow(radius, 2));
	//	area = 3.14*radius*radius;
		System.out.println("Area :"+area);
		circumference = 2*3.14f*radius;
		System.out.println("Circumference :"+circumference);
		

	}

}
