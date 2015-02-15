package org.usfirst.team365.robot.testbench;

public class Trignometry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double result = -400%360;
		System.out.println(unit(50000));
	}
	
	static double unit(double angle){
		double result = angle%360;
		if(angle<0){
			result+=360;
		}
		return result;
	}
	
	static double error(double initialangle, double targetangle)
	{
		double error = targetangle - initialangle;
		if(error<0)
		{
			error = targetangle+360 - initialangle;
		}
		
		return error;
	}

}
