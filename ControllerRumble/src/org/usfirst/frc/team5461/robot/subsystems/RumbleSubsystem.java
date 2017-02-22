package org.usfirst.frc.team5461.robot.subsystems;
import org.usfirst.frc.team5461.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RumbleSubsystem extends Subsystem {

  
   public void RumbleLeft() {
	   Robot.oi.stick.setRumble(RumbleType.kLeftRumble, 1);
	   Robot.oi.stick.setRumble(RumbleType.kRightRumble, 0);
   }
   public void RumbleRight() {
	   Robot.oi.stick.setRumble(RumbleType.kRightRumble, 1);
	   Robot.oi.stick.setRumble(RumbleType.kLeftRumble, 0);
   }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

