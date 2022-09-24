package frc.robot;




import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;





  public class RobotContainer {
    public final DriveSubsystem driveSubsystem = new DriveSubsystem();
    private final Joystick logitechJoystick = new Joystick(0);
    private final TankDriveCommand tankDriveCommand = new TankDriveCommand(logitechJoystick, driveSubsystem);
    public final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    public final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    
  public TankDriveCommand getTankDriveCommand(){
      return tankDriveCommand;
    }
  public Joystick getJoystick(){
    return logitechJoystick;

  }

    

    

  // The robot's subsystems and commands are defined here...


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

          /*button 3 intake ON
        button 4 shooter ON
        button 5 intake and shooter ON at the same time    */
        new JoystickButton(logitechJoystick, 3).whileHeld(new IntakeCommand(intakeSubsystem));
        new JoystickButton(logitechJoystick, 4).whileHeld(new ShooterCommand(shooterSubsystem));
  
        new JoystickButton(logitechJoystick, 2).whileHeld(new ParallelCommandGroup(
          new IntakeCommand(intakeSubsystem), new ShooterCommand(shooterSubsystem)
        ));
 
  
}

  public Command getAutonomousCommand() {
    return null;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  }