package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.ShooterConstants.SHOOTER_OFF_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_ON_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_ON_FASTER_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_DRIVE_ID_1;
import static frc.robot.Constants.ShooterConstants.SHOOTER_DRIVE_ID_2;

public class ShooterSubsystem extends SubsystemBase {
  


    public final ShooterSubsystem setShooterOn = null;
    private PWMTalonSRX SHOOTER_MOTOR_1 = new PWMTalonSRX(SHOOTER_DRIVE_ID_1);
    private PWMTalonSRX SHOOTER_MOTOR_2 = new PWMTalonSRX(SHOOTER_DRIVE_ID_2);
    


  public ShooterSubsystem() {}
    
    public void setShooterOn() {
      SHOOTER_MOTOR_1.set( SHOOTER_ON_SPEED);
      SHOOTER_MOTOR_2.set( SHOOTER_ON_SPEED);
      }
        
    public void setShooterOff() {
      SHOOTER_MOTOR_1.set( SHOOTER_OFF_SPEED);
      SHOOTER_MOTOR_2.set( SHOOTER_OFF_SPEED);
      }

    public void setShooterOnRapid() {
      SHOOTER_MOTOR_1.set( SHOOTER_ON_FASTER_SPEED);
      SHOOTER_MOTOR_2.set( SHOOTER_ON_FASTER_SPEED);
      }
  
    
    

}