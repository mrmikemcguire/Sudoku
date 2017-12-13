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
	}
