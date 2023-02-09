package pattern_programs;

import java.util.Scanner;

public class Number_upto_25_row {
	
	int number=1;
	void print(int pattern)
	{
		for(int row=1; row<=pattern; row++ )
		{
			for(int column=1; column<=pattern; column++)
			{
				System.out.print(number+" ");
				number++;
			}
			  System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Number_upto_25_row number=new  Number_upto_25_row ();
		 System.out.println("please enter pattern");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
		 number.print(a);
		
	}

}
