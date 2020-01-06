//Dynamic array//to display the user entered array elements
package generic;
import java.util.Scanner;
public class MainMat3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int mat[][]=new int[rows][cols];
		System.out.println("enter"+rows*cols+"elements");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered matrix elements:");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
