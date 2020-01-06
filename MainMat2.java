//to print in matrix form
package generic;

public class MainMat2 {
public static void main(String[] args) {
	int mat[][]= {{3,4,5},{6,5,4,9},{3,4},{9,8,7,6}};
	System.out.println("No of rows "+mat.length);
	System.out.println("No of elements in first row:"+mat[0].length);
	System.out.println("No of elements in last row:"+mat[mat.length-1].length);
	for(int row=0;row<mat.length;row++) {
		for(int col=0;col<mat[row].length;col++) {
			System.out.print(mat[row][col]+" ");
		}
		System.out.println();
	}
}
}
