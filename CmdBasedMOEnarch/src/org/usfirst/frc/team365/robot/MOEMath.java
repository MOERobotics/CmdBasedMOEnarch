package org.usfirst.frc.team365.robot;

public class MOEMath {

    /**
     * Normalizes an angle measurement to one between 0-360 degrees
     * @param degree Angle measurement
     * @return Angle measurement between 0-360 degrees
     */
    double normalize(double degree) {
        double result = Math.round(degree)%360;
        if(result<0){
            result=360+result;
        }
        return result;
    }

    /**
     * Converts euclidian (x,y) coordinates into a polar (r,t) angle t.
     * In other words, it gets the angle between (0,0), (0,1), and (x,y)
     * @param x X-Coordinate
     * @param y Y-Coordinate
     * @return Angle in degrees between a coordinate and the X axis
     */
    double getAngle(double x,double y) {
        double angle = atan2mod(x,y)-90;
        return angle;
    }

    /**
     * Converts euclidian (x,y) coordinates into a polar (r,t) radius r.
     * @param x
     * @param y
     * @return Distance betwen (0,0) and a given point.
     */
    double getPower(double x,double y) {
        double power = Math.abs(Math.sqrt(x*x+y*y));
        return limit(power);
    }

    /**
     * Decorator that limits the incoming value to a number between -1 and 1
     * @param current Raw value to be limited
     * @return Value, with a max of 1 and a min of -1
     */
    double limit(double current) {
        if(current<-1){
            return -1;
        }
        if(current>1){
            return 1;
        }
        return current;
    }

    /**
     * Returns 1 if positive, -1 if negative, 0 if zero
     * @param input
     * @return 1,-1,0
     */
    double sign(double input) {
        if (input == 0) return 0;
        return (int)(input/Math.abs(input));
    }

    /**
     * Macro function to convert and normalize (0-360) the output of the Math library Arctangent function
     * @param y
     * @param x
     * @return Angle in degrees between (0,1) and (x,y)
     */
    double atan2mod(double x, double y) {
        return normalize(Math.toDegrees(Math.atan2(y,x)));
    }

    /**
     * Yeah I don't know what this one does.
     * @param input
     * @return stuff
     */
    double turnPower(double input) {
        if(Math.abs(input)>3){
            if(Math.abs(input)>20){
                return sign(input)*.3;
            }
            return sign(input)*.1;
        }
        return 0;
    }

}
