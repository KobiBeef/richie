//HI RICHARD

//Sample of a Program that calculates the AVERAGE of its ELEMENTS
//by Trinmar Boado

import java.text.*;
import javax.swing.*;
public class ArrayAverage
{
	public static void main(String[] args)
	{
		int ArrayLength = Integer.parseInt(JOptionPane.showInputDialog("ENTER How many data to be entered(Length of ARRAY)"));
		double data[] = new double[ArrayLength];
		double ave=0, sum=0;
		DecimalFormat decFor = new DecimalFormat("0.00");
		
		for(int ctr=0; ctr<data.length; ctr++)
		{
			int num = ctr+1;
			data[ctr] = Double.parseDouble(JOptionPane.showInputDialog("["+num+"] ENTER an Integer Data"));
		}

		for(int index=0; index<data.length; index++)
		{
			System.out.println(decFor.format(data[index]));
			sum+=data[index];
		}
		
		ave = sum/ArrayLength;
		System.out.println("the AVERAGE is "+decFor.format(ave));
	}
}
