import java.util.Scanner;
class Employee{
	int no;
	String ename;
	double esalary;
	
	Employee()
	{
	no=0;
	ename="unknown";
	esalary=0;
	}
	
	public Employee(int n,String e,double s){
		no=n;
		ename=e;
		esalary=s;
		}
	public void display(){
		System.out.println(no+"\t"+ename+"\t"+esalary);
		System.out.println("---------------------------");
		}
}
public class EmployeeSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees(N) : ");
		int n=sc.nextInt();
		
		Employee [] arr=new Employee[n];
		sc.nextLine();
		
		System.out.println("\n-----Enter Employees details----- ");
		for(int i=0;i<n;i++){
			System.out.println("Employees"+ (i+1) +": ");
			System.out.print("Enter eNo: ");
			int no=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter eName: ");
			String ename=sc.nextLine();
			System.out.print("Enter eSalary: ");
			double esalary=sc.nextDouble();
			arr[i]= new Employee(no,ename,esalary);
			
		}
		System.out.print("Enter Employee number to search : ");
		int searchid =sc.nextInt();
		boolean found =false;
		System.out.println("\n------Search Result-------");
		for(int i=0;i<n-1;i++){
			if(arr[i].no==searchid){
				System.out.print("Employee Found: ");
				arr[i].display();
				found=true;
				break;
			}
			if(!found)
				System.out.println("Not found");
			}
		}
}
				
			
			
			
