// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Constants;

import com.pathplanner.lib.util.HolonomicPathFollowerConfig;
import com.pathplanner.lib.util.PIDConstants;
import com.pathplanner.lib.util.ReplanningConfig;
import edu.wpi.first.math.util.Units;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
	
	public static class OperatorConstants {
		public static final int driverControllerPort = 0;
		public static final int operatorControllerPort = 1;
	}

	public static class InputConstants{
		public static String triggerPressThresholdKey = "PressThreshold";
		public static double defaultTriggerPressThreshold = 0.1;
	}

	public static class SwerveConstants {
		public static final double maxSpeed = Units.feetToMeters(19.3);
		public static final double angularSpeed = maxSpeed / (Math.hypot(robotLength, robotWidth) / 2);
		public static final double slewRateLimit = 20;
		public static final double dtSeconds = 0.02;
	}

	public static class ShooterConstants {

		public static final int speakerShooterMotorTopID = 51;
		public static final int speakerShooterMotor2ID = 52;

		public static final int ampShooterMotor1ID = 53;
		public static final int ampShooterMotor2ID = 54;
	}

	public static class PivotConstants {
		public static final int pivotEncoderChannel = 0;
		public static final int pivotMotor1ID = 61;
		public static final int pivotMotor2ID = 62;	
	}

	public static class IntakeConstants {
		public static final int intakeMotor1ID = 41;
		public static final int hangerID = 42;
		public static final int handoffMotorID = 43;

	}

	public static class LEDConstants {

	}
	public static final double robotWidth = Units.inchesToMeters(27); // TODO: This must be tuned to specific robot
	public static final double robotLength = Units.inchesToMeters(27); // TODO: This must be tuned to specific robot
	public static final double wheelRatio = Units.inchesToMeters(2);
	public static final double gearRatio = 6.12;
	public static final HolonomicPathFollowerConfig PATH_FOLLOWER_CONFIG = new HolonomicPathFollowerConfig(
			new PIDConstants(1.5, 0.0, 0.0), // Translation PID constants
			new PIDConstants(3, 0.0, 0.0), // Rotation PID constants
			SwerveConstants.maxSpeed, // Max module speed, in m/s
			Units.feetToMeters(1), // Drive base radius in meters. Distance from robot center to furthest module.
			new ReplanningConfig() // Default path replanning config. See the API for the options here
			);

	
	public static class PigeonConstants {
		public static final int pigeonID = 30;
	}

	public static class SwervePIDControllerConstants {
		public static final double driveP = 1.5;
		public static final double driveI = 0;
		public static final double driveD = 0;

		public static final double turnP = 1;
		public static final double turnI = 0;
		public static final double turnD = 0;
	}
}
