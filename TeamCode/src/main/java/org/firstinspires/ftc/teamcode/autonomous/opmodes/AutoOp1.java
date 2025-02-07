package org.firstinspires.ftc.teamcode.autonomous.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Utils.Alliance;
import org.firstinspires.ftc.teamcode.autonomous.AutoOp;

@Autonomous(name = "Test Op 1", group = "Tests")
public class AutoOp1 extends AutoOp {
    @Override
    public Alliance getAlliance() {
        return Alliance.RED;
    }
    
    @Override
    public void runOP() {
        gamepad.guide = true;
        gamepad.right_stick_x = 0.5f;
        
        awaitFrame();
        
        gamepad.guide = false;
        
        sleep(3000);
    }
}
