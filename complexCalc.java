import java.util.Scanner;
class complex{
	double real;
	double img;
	
	complex(){
	real=0;
	img=0;
	}
	
	complex(double r,double i){
	real=r;
	img=i;
	}
	
	complex add(complex c2){
		complex result = new complex();
		result.real=real+c2.real;
		result.img=img+c2.img;
		return result;
	}
	complex sub(complex c2){
		complex result = new complex();
		result.real=real-c2.real;
		result.img=img-c2.img;
		return result;	
	}
	complex mul(complex c2){
		complex result = new complex();
		result.real=(real*c2.real)-(img*c2.img);
		result.img=(real*c2.img)+(img*c2.real);
		return result;
	}
	void display(){
	System.out.println(real+"+"+img+"i");
	
	
	}
	}
public class complexCalc{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.print("enter the real part and imaginary part of first number");
	
	double r1=sc.nextDouble();
	double i1=sc.nextDouble();
	complex c1=new complex(r1,i1);
	System.out.println("enter the real and imaginary part of the second number");
	
	double r2=sc.nextDouble();
	double i2=sc.nextDouble();
	complex c2=new complex(r2,i2);
	System.out.println("\n----------------Result-------------");
	
	
	complex sum=c1.add(c2);
	complex diff=c1.sub(c2);
	complex pro=c1.mul(c2);
	
	System.out.print(" Sum:		");
	sum.display();
	
	
	System.out.print(" Difference:		");
	diff.display();
	
	
	System.out.print(" Product:		");
	pro.display();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
