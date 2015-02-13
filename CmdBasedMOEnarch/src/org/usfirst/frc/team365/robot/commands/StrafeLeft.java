package org.usfirst.frc.team365.robot.commands;

import org.usfirst.frc.team365.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class StrafeLeft extends Command {
	
	RobotMap robot;
	public StrafeLeft(RobotMap robot){
		this.robot = robot;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//Reset Encoders
		robot.distEncoder.reset();
	}

	@Override
	protected void execute() 
	{
		// TODO Auto-generated method stub
		//Move left so many...
		//Twist modules to a particular direction
		//move(-90,.4);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		
		//***if Encoder.RawValue>4500
		//return true
		//
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
