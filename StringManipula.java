import java.util.Scanner;
public class StringManipula{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE STRING:");
		String c1= sc.nextLine();
		System.out.println("A)CREATE A NEW STRING USING NEW");
		String s = new String(c1);
		System.out.println("NEW STRING IS : "+s);
		System.out.println("B)GETTING STRING LENGTH IS : "+ s.length());
		System.out.println("C)STRING CONCATENATION  WITH ING IS : "+(s+"ING"));
		System.out.println("D)CHARACTER EXTRACTION AT 3  IS : "+ s.charAt(3));
		System.out.println("E) THE STRING EQALS TO SING   : "+ s.equals("SING"));
		System.out.println("THE STRING COMPARE TO SING : "+ s.compareTo("SING"));
		System.out.println("F)SEARCHING SUBSTRING : ");
		String p1=new String("Hey Hello");
		System.out.println("NEW STRING IS : "+p1);
		System.out.println("SEARCHING HELLO IN THE ABOVE STATEMENT : "+ p1.indexOf("Hello"));
		System.out.println("G)MODIFYING THE STRING : ");
		System.out.println("REPLACE  STRING  HELLO TO GIRL IN ABOVE STATEMENT : "+ p1.replace("Hello"," Girl"));
		System.out.println("TO UPPERCASE : "+ p1.toUpperCase());
		int p2=10;
		String NUM = String.valueOf(p2);
		System.out.println("NEW INTEGER IS : "+p2);
		System.out.println("H)DATA CONVERSION : "+NUM);
		String p3=new String("FRUITS IN YOUR SURROUNDINGS");
		String[] arr = p3.split(" ");
		System.out.println("THE LISTS OF STRINGS ARE  : "+p3);
		System.out.println("I)STRING SPLITTING : ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("J)MUTABLE STRINGS  : ");
		StringBuffer na = new StringBuffer("hello");
		na.append(" world");
		System.out.println("using buffer: "+na);
		}
		}
