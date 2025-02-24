class Practice12 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int even = 2;
		int odd = 3;
		for (int i = 1; i < n ; i++ )
		{
			for (int j = 1; j < n-i; j++)
			{
				System.out.print("_ ");
			}
			for (int j = 1; j < i ; j++ )
			{
				if (j == 2 || j == 4)
				{
					System.out.print(odd + " ");
					odd+=2;
				}
				else if (j == 1 || j == 3)
				{
					System.out.print(even + " ");
					even+=2;
				}
			}
			System.out.println();
		}
	}
}
