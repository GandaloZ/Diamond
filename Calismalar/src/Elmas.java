
public class Elmas {

	public static void main(String[] args) {
				//Top left.
				//I'm trying and can't figure it out.
				//Let's give it one more try.
				/*
				for (int a = 1; a <= 5; a++)
				{
					for (int b = 10; b > a; b--)
					{
						System.out.print(" ");
					}
					for (int c = 0; c < a; c++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
				*/
				
				//Top right.
				/*
				for (int i = 1; i <= 5; i++)
				{
					for (int j = 0; j < i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				*/
				
				//Top.
				/*
				for (int a = 1; a <= 5; a++)
				{
					for (int b = 10; b > a; b--)
					{
						System.out.print(" ");
					}
					for (int c = 0; c < a; c++)
					{
						System.out.print("*");
					}
					for (int j = 0; j < a; j++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
				*/
				
				//------------------------------------------CODES OF BOTTOMSIDE-----------------------
				
				//Bottom left.
				/*
				for (int a = 5; a >= 1; a--)
				{
					for (int b = 10; b > a; b--)
					{
						System.out.print(" ");
					}
					for (int c = 0; c < a; c++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
				*/
				
				//Bottom right.
				/*
				for (int i = 5; i >= 1; i--)
				{
					for (int j = 0; j < i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				*/
				
				//Bottom.
				/*
				for (int a = 5; a >= 1; a--)
				{
					for (int b = 10; b > a; b--)
					{
						System.out.print(" ");
					}
					for (int c = 0; c < a; c++)
					{
						System.out.print("*");
					}
					for (int j = 0; j < a; j++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
				*/
				
				diamonds();

	}

	private static void diamonds() {
				//Top.
				for (int e = 1; e <= 5; e++)
				{
					for (int f = 10; f > e; f--)
					{
						System.out.print(" ");
					}
					for (int g = 0; g < e; g++)
					{
						System.out.print("*");
					}
					for (int k = 0; k < e; k++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
				//Bottom.
				for (int a = 5; a >= 1; a--)
				{
					for (int b = 10; b > a; b--)
					{
						System.out.print(" ");
					}
					for (int c = 0; c < a; c++)
					{
						System.out.print("*");
					}
					for (int j = 0; j < a; j++)
					{
						System.out.print("*");
					}
					System.out.println();	
				}
		
	}

}
