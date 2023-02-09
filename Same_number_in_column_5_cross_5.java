package pattern_programs;

public class Same_number_in_column_5_cross_5 {
	
	void print()
	{
		int column;
		int row;
		
		for(row=1; row<=5; row++)
		{
			for(column=1; column<=5; column++)
			{
				System.out.print(" "+column);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Same_number_in_column_5_cross_5 pattern=new Same_number_in_column_5_cross_5();
		pattern.print();
	}

}
