import java.util.Scanner;
public class matrixopn{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DIMENSHIONS FOR MATRIX A");
		System.out.print("Rows: ");
		int r1 = sc.nextInt();
		
		System.out.print("Columns: ");
		int c1 = sc.nextInt();
		
		System.out.println("ENTER THE DIMENSHIONS FOR MATRIX B");
		System.out.print("Rows: ");
		int r2 = sc.nextInt();
		
		System.out.print("Columns: ");
		int c2 = sc.nextInt();
		
		int[][] A =new int[r1][c1];
		int[][] B =new int[r2][c2];
		
		//reading matrix A
		System.out.println("ENTER THE ELEMENTS FOR MATRIX A");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				A[i][j] = sc.nextInt();
			}
		}
		//reading matrix B
		System.out.println("ENTER THE ELEMENTS FOR MATRIX B");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				B[i][j] = sc.nextInt();
			}
		}
		
		//menu driven loop
		while(true){
		System.out.println("MENU \n1.ADDITION\n2.MULTIPLICATION\n3.EXIT");
		System.out.print("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		
		if (choice==3) break;
		
		switch(choice){
		case 1://addition
			if(r1==r2 && c1==c2){
				System.out.println("Sum matrix: ");
				for(int i=0;i<r1;i++){
					for(int j=0;j<c1;j++)
					{
					System.out.print((A[i][j]+B[i][j])+"\t");
					}
					System.out.println();
					}
				
			}
			else{
				System.out.println("Error:Dimensions must be same for addition");
				}
			break;
			
		case 2:
			if(r1==r2){
				System.out.println("product matrix");		
				int[][]c = new int[r1][c2];
				for(int i=0;i<r1;i++){
					for(int j=0;j<c2;j++){
						c[i][j]=0;
						for(int k=0;k<c1;k++){
							c[i][j]+=A[i][k]*B[k][j];
							}
						System.out.print(c[i][j]+"\t");
						}
					System.out.println();
					}
				}
			else{
			System.out.println("Error:colunm of A must equal Row of B:");
			}
			break;
			default:
			System.out.println("Invalid choice!");
			}
		}
	}
}
