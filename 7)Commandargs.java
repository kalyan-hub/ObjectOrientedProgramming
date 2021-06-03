class Main{
	public static void main(String[] args)
	{
		int max=Integer.valueOf(args[0]);
		int min=Integer.valueOf(args[0]);
		int n = args.length;
		for(int i=0;i<n;i++)
		{
			int k=Integer.parseInt(args[i]);
			if(max<k)
			{
				max=k;
			}
			else if(min>k)
			{
				min=k;
			}
		}
		System.out.println("Minimum: "+min+"Maximum: "+max);
	}
}
