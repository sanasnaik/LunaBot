/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class Hatch extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 DoubleSolenoid doublesolenoid = new DoubleSolenoid(RobotMap.SOLENOID_PORT_1, RobotMap.SOLENOID_PORT_2);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   // setDefaultCommand(new ExtendHatch());
  }
  public void extendhatch() {
    doublesolenoid.set(DoubleSolenoid.Value.kForward);
  }
  public void retracthatch() {
    doublesolenoid.set(DoubleSolenoid.Value.kReverse);
  }
  public void turnoffhatch() {
    doublesolenoid.set(DoubleSolenoid.Value.kOff);
  }
}
