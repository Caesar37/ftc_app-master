package com.qualcomm.ftcrobotcontroller.opmodes;

import com.jacobamason.FTCRC_Extensions.Drive;
import com.jacobamason.FTCRC_Extensions.DriveTrain;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Matthew on 8/11/2015.
 */
public class TankDriveOpMode extends OpMode{
    Drive driver;
    DcMotor left, right;
    DriveTrain driveTrain = new DriveTrain();

    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
        left.setDirection(DcMotor.Direction.REVERSE);
        driveTrain.addLeftMotor(left);
        driveTrain.addRightMotor(right);
        driver = new Drive(this, driveTrain, 0.15f);
    }

    @Override
    public void loop() {
        driver.tank_drive();
    }
}
