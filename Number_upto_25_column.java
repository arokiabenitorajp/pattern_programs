package pattern_programs;

import java.util.Scanner;

public class Number_upto_25_column {
	
	void print(int pattern)
	{
		
		for(int row=1; row<=pattern; row++)
		{
			int num=row;
			for(int column=1; column<=pattern; column++)
			{
				System.out.print(num+" ");
				num=num+pattern;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}

		Number_upto_25_column number=new Number_upto_25_column();
	
		System.out.println(number.getClass());
		System.out.println("please enter pattern");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		number.print(a);
		
	}

}
