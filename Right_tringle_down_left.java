package pattern_programs;

public class Right_tringle_down_left {
	
	void show(int row_pattern,int column_pattern)
	{
		
		
		for(int row=1; row<=row_pattern; row++)
		{
			for(int column=1; column<=row ; column++)
			{
				System.out.print(row+" ");
				
			}
			System.out.println();
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right_tringle_down_left pattern=new Right_tringle_down_left();
		pattern.show(9,9);

	}

}
