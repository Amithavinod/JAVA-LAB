import java.util.Scanner;
class Cpu{
	double price;
	
	Cpu(){
	price=0;
	}
	
	Cpu(double p){
		price=p;
	}
	
	class Processer{
		int cores;
		String manufacturer;
		
		
	Processer(){
		cores=0;
		manufacturer="";
	}
	Processer(int c,String m){
		cores=c;
		manufacturer=m;
		}
		}
	static class Ram{
		int memory;
		String manufacturer;
	
	Ram(){
		memory=0;
		manufacturer="";
	}
	Ram(int m,String ma){
		memory=m;
		manufacturer=ma;
		}
		}
		}
		
public class CpuMain{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER THE DETAILS OF CPU:");
		System.out.print("ENTER THE PRICE OF CPU:");
		double p1=sc.nextDouble();
		sc.nextLine();
		
		Cpu c1 = new Cpu(p1);
		
		System.out.print("ENTER THE CORES OF PROCESSER:");
		int p2 =sc.nextInt();
		sc.nextLine();
		System.out.print("ENTER THE MANUFACTURER OF PROCESSER:");
		String p3 =sc.nextLine();
		
		Cpu.Processer c2 = c1.new Processer(p2,p3);
		
		System.out.print("ENTER THE MEMORY OF RAM:");
		int p4 =sc.nextInt();
		sc.nextLine();
		System.out.print("ENTER THE MANUFACTURER OF RAM:");
		String p5 =sc.nextLine();
		
		Cpu.Ram c3 = new Cpu.Ram(p4,p5);
		
		System.out.println("\n THE DETAILS OF CPU IS:");
		System.out.println("PRICE OF CPU:"+c1.price);
		System.out.println("CORES OF PROCESSER:"+c2.cores);
		System.out.println("MANUFACTURER OF PROCESSER:"+c2.manufacturer);
		System.out.println("MEMORY OF CPU:"+c3.memory);
		System.out.println("MANUFACTURER OF CPU:"+c3.manufacturer);
		}
		}
		
		
