package org.firstinspires.ftc.teamcode.auto;

import static org.firstinspires.ftc.teamcode.movement.MOV_cam.is_ID;
import static org.firstinspires.ftc.teamcode.movement.MOV_cam.tag_ID;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.movement.MOV_cam;

import java.util.Objects;

@Autonomous
public class auto_start extends LinearOpMode {

    @Override
    public void runOpMode(){
        MOV_cam.vid(hardwareMap);
        waitForStart();

        while(opModeIsActive()){
            //DRIVE TO TAG
            if (is_ID() != true) {
                //ADJUST TO THE APRIL TAG????????? ADD LATER !! !!
            }
            String APRT = tag_ID();

            if (Objects.equals(APRT, "GPP")){
                //GPP MOTION
            }
            else if (Objects.equals(APRT, "PPG")){
                //PPG MOTION
            }
            else if (Objects.equals(APRT, "PGP")){
                //PGP MOTION
            }

        }
    }
}
