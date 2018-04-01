package com.sunbeaminfo.jagged;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//ragged array -- 2-d array in which each array of different size.
		//int [][]rag1 = { {1,2,3,4}, {2,3}, {4,5,6} };
		//printMatrix(rag1);

		int k ;
		int [][]rag2 = new int[4][];
		for (int i = rag2.length; i >=1; i--) 
		{			
			rag2[rag2.length-i] = new int[i];
			k=1;
			for(int j = 0; j < rag2.length-(rag2.length-i); j++) 
			{
				rag2[rag2.length-i][j] = k;
				
				k++;	
			}
					
		}
		
		printMatrix(rag2);
	}
	public static void printMatrix(int[][] mat) 
	{
		for (int i = 0; i < mat.length; i++)
		{
			for(int j=0; j < mat[i].length; j++) 
			{
				System.out.printf("%d\t", mat[i][j]);

			}
			System.out.println();
		}
	}
}


