import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];
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
	 	System.out.println("is ");
	  	for(int i = 0; i < column; i++)
	    	{
	      	    for(int j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }

	}

}
