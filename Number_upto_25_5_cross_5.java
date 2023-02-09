package pattern_programs;

public class Number_upto_25_5_cross_5 {
	
  void print()
  {
	  int row;
	  int column;
	  int number=1;
	  for(row=1; row<=5; row++)
	  {
		  for(column=1; column<=5; column++)
		  {
			  System.out.print(number+" ");
			  number++;
		  }
		  System.out.println();
	  }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number_upto_25_5_cross_5 pattern=new Number_upto_25_5_cross_5();
		pattern.print();

	}

}
