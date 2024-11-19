package data_structure;

public class BFSDemo
{
	public static void main(String[] args) 
	{
		int matrix[][] = {{5,65,23,32,11},
						  {42,31,77,74,90},
						  {12,22,29,95,67},
						  {9,54,13,65,99},
						  {36,49,88,7,91}
						 };
		findElement(matrix, 90);
	}
	
	static void findElement(int[][] matrix, int key)
	{
		boolean keyFound = false;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j] == key)
				{
					keyFound = true;
					System.out.println(key + " found at index (" + i + "," + j + ")");
				}
			}
		}
		if(!keyFound)
		{
			System.out.println(key + " not found in matrix");
		}
	}

}
