import java.util.Scanner;
public class UpperTriangularMatrix {
	public static int row;
	public static int column;
	public static void main(String[] args) {
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		row = s.nextInt();
		column = s.nextInt();
		double array[][] = new double[row][column];
		System.out.println("Enter matrix:");
	 	for(int i = 0; i < row; i++)
	  	{
	   	    for(int j = 0; j < column; j++) 
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The transpose of matrix: ");
	  	for(int i = 0; i < row; i++)
	    	{
	      	    for(int j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	  	isUpperTriangular(array);

	}
	public static boolean isUpperTriangular(double[][] array) {
		boolean triangle = true;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(i > j) {
					if(array[i][j] != 0) {
						triangle = false;
						System.out.println("The matrix is not an upper triangular matrix.");
						break;
					}
				}
			}
		}
		if(triangle) {
			System.out.println("The matrix is an upper triangular matrix.");
		}
		return triangle;
	}

}
