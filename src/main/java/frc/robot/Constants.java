// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.pathplanner.lib.util.HolonomicPathFollowerConfig;
import com.pathplanner.lib.util.PIDConstants;
import com.pathplanner.lib.util.ReplanningConfig;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.trajectory.TrapezoidProfile;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final double DRIVETRAIN_THROTTLE = 1.0; // Drivetrain throttle
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final int DRIVETRAIN_PIGEON_ID = 5;
  public static final double DRIVETRAIN_WHEELBASE_METERS = 0.5842; 
  public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.5842;

  public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 1; // DONE Set front left module drive motor ID
  public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 11; // DONE Set front left module steer motor ID
  public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 21; // DOne Set front left steer encoder ID
  // public static final double FRONT_LEFT_MODULE_STEER_OFFSET =
  // -Math.toRadians(239.22); // DONE Measure and set front
  public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(153.414); // DONE Measure and set front
                                                                                       // left steer offset

  public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 2; // DONE Set front right drive motor ID
  public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 12; // DOne Set front right steer motor ID
  public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 22; // DONE Set front right steer encoder ID
  // public static final double FRONT_RIGHT_MODULE_STEER_OFFSET =
  // -Math.toRadians(56.25); // DONE Measure and set front
  public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(85.009); // DONE Measure and set front
                                                                                       // right steer offset

  public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 3; // DONE Set back left drive motor ID
  public static final int BACK_LEFT_MODULE_STEER_MOTOR = 13; // DONE Set back left steer motor ID
  public static final int BACK_LEFT_MODULE_STEER_ENCODER = 23; // DONE Set back left steer encoder ID
  // public static final double BACK_LEFT_MODULE_STEER_OFFSET =
  // -Math.toRadians(359.9); // DONE Measure and set back
  public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(298.819); // DONE Measure and set back
                                                                                    // left steer offset

  public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 4; // DONE Set back right drive motor ID
  public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 14; // DONE Set back right steer motor ID
  public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 24; // DONE Set back right steer encoder ID
  // public static final double BACK_RIGHT_MODULE_STEER_OFFSET =
  // -Math.toRadians(136.40); // DONE Measure and set back
  public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(225.062); // DONE Measure and set back
                                                                                       // right steer offset

  public static final double kPXController = 0.077777;// need to change for comp bot
  public static final double kPYController = 0.077777;
  public static final double kPXYController = 0.077777;
  public static final double kPThetaController = 0.77777;

  // I'm not sure where these values come from, but this is what 0 to auto code is
  // using.
  public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;
  public static final double kMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
  public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;

  public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
      new TrapezoidProfile.Constraints(
          kMaxAngularSpeedRadiansPerSecond,
          kMaxAngularAccelerationRadiansPerSecondSquared);

  // Deadzone for auto balancing
  public static final double DRIVETRAIN_AUTOBALANCE_DEADZONE_Y = 7.0;
  public static final double DRIVETRAIN_AUTOBALANCE_DEADZONE_X = 7.0;
  public static final double DRIVETRAIN_AUTOBALANCE_THROTTLE = 1.50;  // Old:  1.75;

  public static final Translation2d flModuleOffset = new Translation2d(DRIVETRAIN_TRACKWIDTH_METERS / 2.0, DRIVETRAIN_WHEELBASE_METERS / 2.0);
  public static final Translation2d frModuleOffset = new Translation2d(DRIVETRAIN_TRACKWIDTH_METERS / 2.0, -DRIVETRAIN_WHEELBASE_METERS / 2.0); 
  public static final Translation2d blModuleOffset = new Translation2d(-DRIVETRAIN_TRACKWIDTH_METERS / 2.0, DRIVETRAIN_WHEELBASE_METERS / 2.0);
  public static final Translation2d brModuleOffset = new Translation2d(-DRIVETRAIN_TRACKWIDTH_METERS / 2.0, -DRIVETRAIN_WHEELBASE_METERS / 2.0);

  public static final double maxModuleSpeed = 4.5; //NEED TO FIND OUT

  public static final HolonomicPathFollowerConfig pathFollowerConfig = new HolonomicPathFollowerConfig(
      new PIDConstants(.077777, 0, 0), // Translation constants 
      new PIDConstants(0.77777, 0, 0), // Rotation constants 
      maxModuleSpeed, 
      flModuleOffset.getNorm(), // Drive base radius (distance from center to furthest module) 
      new ReplanningConfig()
    );
}