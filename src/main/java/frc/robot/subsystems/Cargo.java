/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * Add your docs here.
 */
public class Cargo extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

public Cargo() {
  VictorSPX intakevictor = new VictorSPX(RobotMap.VICTOR_INTAKE_PORT);
  VictorSPX shootervictor = new VictorSPX(RobotMap.VICTOR_SHOOTER_PORT);
  shootervictor.follow(intakevictor);  
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
  public void intakeshooter() {
    intakevictor.set(ControlMode.PercentOutput, 0.5);
  }
  public void reverseCargo() {
    intakevictor.set(ControlMode.PercentOutput, -0.5);
  }
  public void stopCargo () {
    intakevictor.set(ControlMode.PercentOutput, 0.0);
  }
}
