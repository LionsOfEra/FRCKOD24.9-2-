package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//Import the constants
import static frc.robot.Constants.IntakeConstants.INTAKE_OFF_SPEED;
import static frc.robot.Constants.IntakeConstants.INTAKE_ON_SPEED;
import static frc.robot.Constants.IntakeConstants.INTAKE_ON_FASTER_SPEED;
import static frc.robot.Constants.IntakeConstants.INTAKE_DRIVE_ID;

public class IntakeSubsystem extends SubsystemBase {
  
    //declare the motor ids
    private PWMVictorSPX intakeMotor = new PWMVictorSPX(INTAKE_DRIVE_ID);
    public IntakeSubsystem setIntakeOn;

  public IntakeSubsystem() {}

  @Override
  public void periodic() {}

    //When the command is executed this turns on and off the intake. I think
    public void setIntakeOn() {
        intakeMotor.set( INTAKE_ON_SPEED);
        } 
    public void setIntakeOff() {
        intakeMotor.set( INTAKE_OFF_SPEED);
        }
    public void setShooterOnRapid() {
        intakeMotor.set( INTAKE_ON_FASTER_SPEED);
        }

}