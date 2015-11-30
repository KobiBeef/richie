

//Sample of a Program that calculates the AVERAGE of its ELEMENTS
//by Trinmar Boado

import javax.swing.*;
public class ArrayTotal
{
	public static void main(String[] args)
	{
		double array[] = new double[5];
		double sum=0;
				
		for(int ctr=0; ctr<array.length; ctr++)
		{
			array[ctr] = Double.parseDouble(JOptionPane.showInputDialog(" ENTER a number"));
		}

		for(int index=0; index<array.length; index++)
		{
			System.out.println(array[index]);
			sum+=array[index];
		}
		System.out.println("the TOTAL is "+sum);
	}
}