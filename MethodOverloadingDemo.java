import java.util.Scanner;
class Geometry{
	double area( double r){
		return Math.PI*r*r;
	}
	double area( double l,double b){
		return l*b;
	}
	double area( double a, double b,double c){
		if((a+b <=c) || (a+c<=b) || (b+c<=a)){
			System.out.print("will not form");
			return 0;
		}
		
		double s=(a+b+c)/2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
	}
}
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Geometry g= new Geometry();
		System.out.println("--- Method Overloading: Area Calculation ---\n");
		System.out.print("Enter radius of the Circle: ");
		double r = sc.nextDouble();
		System.out.print(" Area of circle : "+g.area(r));

	
		System.out.print("\nEnter length and breadth of the Rectangle: ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.print(" Area of circle : "+g.area(l,b));
		
		
		
		System.out.print("\nEnter three sides of the Triangle (a, b, c): ");
		double a = sc.nextDouble();
		double f = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.print(" Area of circle : "+g.area(a,f,c));
	}
}
				
		
