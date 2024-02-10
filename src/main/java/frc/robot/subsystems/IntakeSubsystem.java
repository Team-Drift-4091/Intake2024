// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    CANSparkMax leftMotor = new CANSparkMax(20, MotorType.kBrushed);
    CANSparkMax rightMotor = new CANSparkMax(21, MotorType.kBrushed);

    public IntakeSubsystem() {
        leftMotor.restoreFactoryDefaults();
        rightMotor.restoreFactoryDefaults();
    }

    public void on() {
        leftMotor.set(1); // Set motor speed to full forward
        rightMotor.set(1);
    }

    public void off() {
        leftMotor.set(0); // Turn off the motor
        rightMotor.set(0); // Turn off the motor
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}