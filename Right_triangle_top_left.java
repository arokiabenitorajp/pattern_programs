package pattern_programs;

import java.util.Scanner;

public class Right_triangle_top_left {
	Right_triangle_top_left()
	{
		
	}
 
	void print(int row_pattern,int column_pattern)
	{
		for(int row=1; row<=row_pattern; row++)
		{
			for(int column=row; column<=column_pattern; column++)
			{
				System.out.print(row);
				
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Right_triangle_top_left pattern=new Right_triangle_top_left();
		
		Scanner sc=new Scanner(System.in);
		int row_pattern=sc.nextInt();
		int column_pattern=sc.nextInt();
		
		pattern.print(row_pattern,column_pattern);
		
	}

}
