class Pattern6 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i == j || i + j == n-1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.println(" " + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
