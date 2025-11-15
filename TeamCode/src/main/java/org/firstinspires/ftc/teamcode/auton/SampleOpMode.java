package org.firstinspires.ftc.teamcode.auton;

import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
import org.firstinspires.ftc.teamcode.MecanumDrive;

@Autonomous(name = "SampleAuto")
public class SampleOpMode extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException{

        //create starting pos
        Pose2d beginPose = new Pose2d(0,0,Math.toRadians(180));

        //create rr drive obj
        MecanumDrive drive = new MecanumDrive(hardwareMap, beginPose);

        waitForStart();

        //create path
        Action path = drive.actionBuilder(beginPose)
                .lineToX(24)
                .build();
        Actions.runBlocking(new SequentialAction(path));
    }

}
