package org.usfirst.frc.team365.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public DriverStation ds;
	public CANTalon twistLeftFront = new CANTalon(3);
	public CANTalon twistRightFront = new CANTalon(4);
	public CANTalon twistLeftRear = new CANTalon(12);
	public CANTalon twistRightRear = new CANTalon(11);
	
	public CANTalon driverLeftFront = new CANTalon(1);
	public CANTalon driverRightFront = new CANTalon(2);
	public CANTalon driverLeftRear = new CANTalon(14);
	public CANTalon driverRightRear = new CANTalon(13);
	
	public CANTalon lifterOne = new CANTalon(0);
	public CANTalon lifterTwo = new CANTalon(15);
	
	public Encoder encoderLF = new Encoder(4,5,true,EncodingType.k1X);
	public Encoder encoderRF = new Encoder(0,1,true,EncodingType.k1X);
	public Encoder encoderLR = new Encoder(6,7,true,EncodingType.k1X);
	public Encoder encoderRR = new Encoder(8,9,true,EncodingType.k1X);
	public Encoder distEncoder = new Encoder(2,3,true,EncodingType.k1X);
	
	public Gyro moeGyro = new Gyro(1);
	
	public Joystick xBox = new Joystick(0);
	
	
	
}
