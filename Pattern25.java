class Pattern25 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		int n = 1;

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				if (i == 1|| i == 3 || i == 5)
				{
					System.out.print(ch+ " ");
			        ch++;
				}
				else if (i == 2 || i == 4)
				{
					System.out.print(n + " ");
				    n++;
				}
			}
			System.out.println();
		}
	}
}
