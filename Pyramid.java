class Pyramid
{
	public static void main(String args[])
	{
		DoIt myDoIt = new DoIt();
		
		myDoIt.thirdPattern();
		System.out.println();
		
		myDoIt.firstPattern();
		System.out.println();
		
		myDoIt.secondPattern();
		System.out.println();
	}
}

class DoIt
{
	void thirdPattern()
	{
		int numOfLines = 15;
		for(int line = 1; line <= numOfLines; line++)
		{
			int lastLineDots = 1 + 2*(numOfLines-1);
			int numOfDots = 1 + 2*(line - 1); 
			
			for(int space = 1; space <= (lastLineDots - numOfDots) / 2; space++)
			{
				System.out.print(" ");
			}
			
			for(int x = 1; x <= numOfDots; x++)
			{
				if(x % 2 == 0) System.out.print("");
				else System.out.print("*");
			}
			
			System.out.println();
		}
	}
	void secondPattern()
	{
		int numOfLines = 15;
		for(int line = 1; line <= numOfLines; line++)
		{
			int lastLineDots = 1 + 2*(numOfLines-1);
			int numOfDots = 1 + 2*(line - 1); 
			
			for(int space = 1; space <= (lastLineDots - numOfDots) / 2; space++)
			{
				System.out.print(" ");
			}
			
			for(int x = 1; x <= numOfDots; x++)
			{
				if(x % 2 == 0) System.out.print("A");
				else System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	void firstPattern()
	{
		int numOfLines = 15;
		for(int line = 1; line <= numOfLines; line++)
		{
			int lastLineDots = 1 + 2*(numOfLines-1);
			int numOfDots = 1 + 2*(line - 1); 
			
			for(int space = 1; space <= (lastLineDots - numOfDots) / 2; space++)
			{
				System.out.print(" ");
			}
			
			for(int x = 1; x <= numOfDots; x++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}