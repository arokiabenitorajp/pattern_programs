package pattern_programs;

public class One_in_5_cross_5 {
	
	void show()
	{
		int column;
		int row;
		
		for(row=1; row<=5; row++)
		{
			for( column=1;  column<=5;  column++)
			{
				System.out.print(1);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 One_in_5_cross_5 pattern=new One_in_5_cross_5 ();
		 pattern.show();
	}

}
