// hmm interesting.. interesting indeed.. 

public class ArrayInMethod
{
	public static void main(String[] args)
	{
		int timi[]={3,4,5,6,7};
		int sum=0;
		Change(timi);
		
		for(int y:timi)
			System.out.println(y);
		
	}
	
	public static void Change(int x[])
	{
		for(int counter=0; counter<x.length; counter++)
			x[counter]+=5;
			
	
	}
}
