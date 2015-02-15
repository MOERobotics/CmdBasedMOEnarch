package org.usfirst.frc.team365.robot;

public class MOEMath 
{



double norm(double degree){
double result = Math.round(degree)%360;
if(result<0){
result=360+result;
}
return result;
}
double getAngle(double x,double y){
double angle = atan2mod(y, x)-90;
return angle;
}
double getPower(double x,double y){
double power = Math.abs(Math.sqrt(x*x+y*y));
return limit(power);
}
double limit(double current){
if(current<-1){
return -1;
}
if(current>1){
return 1;
}
return current;
}
double sign(double input){
return input/Math.abs(input);
}
double atan2mod(double y, double x){
double result = Math.atan2(y,x)*180/Math.PI;
if(result<0){
result= 360+result;
}
return result;
}
double turnPower(double input){
if(Math.abs(input)>3){
if(Math.abs(input)>20){
return sign(input)*.3;
}
return sign(input)*.1;
}
return 0;
}

}
