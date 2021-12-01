// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

//dt 
//DIO Ports - use DigitalInput class
//public static final int ARM_GRIPPER = 8; 
//public static final int ARM_TILT = 9; 
//public static final int ARM_LIFT = 10; 

//XBox Controller buttons
public static final int ROBOT_MOVE = 11;
public static final int ARM_GRIPPER_OPEN = 2;
public static final int ARM_GRIPPER_CLOSE = 3; //gripper
public static final int ARM_TILT_UP = 5;
public static final int ARM_TILT_DOWN =6;
public static final int ARM_LIFT_UP = 4;
public static final int ARM_LIFT_DOWN = 1;

public final class Arm {
    // Port configuration to match physical configuration on
    // Romi board as well as configuration on http://wpilib.local
    public static final int LIFT_PORT = 4;
    public static final int TILT_PORT = 3;
    public static final int GRIPPER_PORT = 2;
    public static final int GRIPPER_FEEDBACK_PORT = 0;

    // From https://www.pololu.com/docs/0J76/4
    // Servo ranges are already restricted in the core Servo
    // class to 600 - 2400 microseconds. However, the
    // arm does have the ability to bind if the servos move past 
    // the recommended ranges. With that, we are further restricting
    // the range of our arm servos. Adjust these for more range of motion
    // but do so with caution.
    // Lift range 1000 - 1900 -> .222 - .722
    // Tilt range 1200 - 1900 -> .333 - .722
    // Gripper range 500 - 2400 -> 0 - 1
    public static final double LIFT_MIN = 0.222;
    public static final double LIFT_MAX = 0.722;
    public static final double TILT_MIN = 0.333;
    public static final double TILT_MAX = 0.722;
    public static final double GRIPPER_MIN = 0.0;
    public static final double GRIPPER_MAX = 1.0;

    // Incremental amount of change for each button press
    // or during the periodic check while holding the button down
    public static final double SERVO_INCREMENT = 0.005;
}


}
