import java.util.Scanner;
public class ColumnAverage {
	public static int row;
	public static void main(String[] args) {
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		row = s.nextInt();
		int col = s.nextInt();
		double matrix[][] = new double[row][col];
		System.out.println("Enter matrix:");
	 	for(int i = 0; i < row; i++)
	  	{
	   	    for(int j = 0; j < col; j++) 
	     	    {
	        	matrix[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
	 	System.out.println("What column: ");
	 	int colNum = s.nextInt();
	 	System.out.println("The matrix: ");
	  	for(int i = 0; i < row; i++)
	    	{
	      	    for(int j = 0; j < col; j++)
	            {
	          	System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	 	averageRow(matrix, colNum);

	}
	public static double averageRow(double[][] array, int column) {
		double total = 0;
		double average = 0;
		for(int i = 0; i < row; i++) {
			total = total + array[i][column];
		}
		average = total / row;
		System.out.println("The average of column " + column + " is " + average);
		return average;
	}

}
