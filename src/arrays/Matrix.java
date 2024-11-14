package arrays;

import java.util.Arrays;

public class Matrix 
{
	public static void main(String[] args) 
	{
		int[][] matrix1 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		int[][] matrix2 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		int[][] result = new int[matrix1.length][matrix2.length];
		
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix2.length;j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("The result matrix is : ");
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix2.length;j++)
			{
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
