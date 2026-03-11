import java.util.Scanner;
import mathutils.calculator;

public class packageDemo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		calculator calc=new calculator ();
		System.out.println("first number");
		double n1=sc.nextDouble();
		System.out.println("second number");
		double n2=sc.nextDouble();
		System.out.println("ADDITION	:"+calc.add(n1,n2));
		System.out.println("SUBTRACTION :"+calc.sub(n1,n2));
		System.out.println("MULTIPLICATION :"+calc.multi(n1,n2));
		if(n2==0.0){
		System.out.println("not divisible by zero");
		}
		else{
		System.out.println("DIVISION :"+calc.divi(n1,n2));
		}
	}
}

		
