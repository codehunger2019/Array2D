package generic;

public class MainMat1 {
	public static void main(String[] args) {
		//int mat[][];	
		//int [][]mat;
		//int []mat[];
	int [][]mat;//declaration
	mat=new int[3][4];//allocation
	mat[1][2]=34;//initialization
	mat[2][3]=56;
	System.out.println(mat.length);//no of rows
	System.out.println(mat[0].length);//no of elements in first row
	System.out.println(mat[mat.length-1].length);//no of elements in last row
	System.out.println(mat[0][0]);//0
	System.out.println(mat[0][1]);//0//accessing
	System.out.println(mat[1][2]);//34
	}
}
