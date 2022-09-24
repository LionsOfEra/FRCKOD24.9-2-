package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;


public class TankDriveCommand extends CommandBase {

  DriveSubsystem DriveTrainSubsystem;
  Joystick joystick;

  public TankDriveCommand(Joystick lucitik, DriveSubsystem DriveSubs) {
    addRequirements(DriveSubs);  
    DriveTrainSubsystem = DriveSubs;
    joystick = lucitik;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  DriveTrainSubsystem.tankDrive(joystick.getRawAxis(1), joystick.getRawAxis(5));
  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end (boolean interrupted) {
    DriveTrainSubsystem.tankDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}