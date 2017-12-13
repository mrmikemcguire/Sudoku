import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Generator
	{
	static int [] [] grid = new int [9][9];
	static Scanner seed;
	
	public static void main(String[] args) throws IOException
		{
		fillGrid();
		testGrid();
		display();

		}

	public static void fillGrid() throws IOException
		{
		seed = new Scanner(new File("seed.txt"));
		for(int row = 0; row < 9; row++)
			{
			for(int col = 0; col < 9; col++)
				{
				grid[row][col] = seed.nextInt();
				}
			}
		}
	
	public static void testGrid()
		{
		for(int row = 0; row < 9; row++)
			{
			for(int col = 0; col < 9; col++)
				{
				System.out.print(grid[row][col] + " ");
				}
			System.out.println();
			}
		System.out.println();
		System.out.println();
		}
	
	public static void display()
		{
		System.out.println("=========================================");
		System.out.println("|| " + grid[0][0] + " | " +  grid[0][1] + " | " + grid[0][2] +
				" || " + grid[0][3] + " | " + grid[0][4] + " | " + grid[0][5] + 
				" || " + grid[0][6] + " | " + grid[0][7] + " | " + grid[0][8] + " ||");
		System.out.println("|| " + grid[1][0] + " | " +  grid[1][1] + " | " + grid[1][2] +
				" || " + grid[1][3] + " | " + grid[1][4] + " | " + grid[1][5] + 
				" || " + grid[1][6] + " | " + grid[1][7] + " | " + grid[1][8] + " ||");
		System.out.println("|| " + grid[2][0] + " | " +  grid[2][1] + " | " + grid[2][2] +
				" || " + grid[2][3] + " | " + grid[2][4] + " | " + grid[2][5] + 
				" || " + grid[2][6] + " | " + grid[2][7] + " | " + grid[2][8] + " ||");
		System.out.println("-----------------------------------------");
		System.out.println("|| " + grid[3][0] + " | " +  grid[3][1] + " | " + grid[3][2] +
				" || " + grid[3][3] + " | " + grid[3][4] + " | " + grid[3][5] + 
				" || " + grid[3][6] + " | " + grid[3][7] + " | " + grid[3][8] + " ||");
		System.out.println("|| " + grid[4][0] + " | " +  grid[4][1] + " | " + grid[4][2] +
				" || " + grid[4][3] + " | " + grid[4][4] + " | " + grid[4][5] + 
				" || " + grid[4][6] + " | " + grid[4][7] + " | " + grid[4][8] + " ||");
		System.out.println("|| " + grid[5][0] + " | " +  grid[5][1] + " | " + grid[5][2] +
				" || " + grid[5][3] + " | " + grid[5][4] + " | " + grid[5][5] + 
				" || " + grid[5][6] + " | " + grid[5][7] + " | " + grid[5][8] + " ||");
		System.out.println("-----------------------------------------");
		System.out.println("|| " + grid[6][0] + " | " +  grid[6][1] + " | " + grid[6][2] +
				" || " + grid[6][3] + " | " + grid[6][4] + " | " + grid[6][5] + 
				" || " + grid[6][6] + " | " + grid[6][7] + " | " + grid[6][8] + " ||");
		System.out.println("|| " + grid[7][0] + " | " +  grid[7][1] + " | " + grid[7][2] +
				" || " + grid[7][3] + " | " + grid[7][4] + " | " + grid[7][5] + 
				" || " + grid[7][6] + " | " + grid[7][7] + " | " + grid[7][8] + " ||");
		System.out.println("|| " + grid[8][0] + " | " +  grid[8][1] + " | " + grid[8][2] +
				" || " + grid[8][3] + " | " + grid[8][4] + " | " + grid[8][5] + 
				" || " + grid[8][6] + " | " + grid[8][7] + " | " + grid[8][8] + " ||");
		System.out.println("=========================================");


		}
	
	
	}
