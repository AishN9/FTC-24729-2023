package org.firstinspires.ftc.teamcode.modules.Camera;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.Utils.Alliance;
import org.firstinspires.ftc.vision.VisionPortal;

public class AutonomousCameraManager extends CameraManager {
    public PropDetection prop;
    
    public AutonomousCameraManager(WebcamName camera, Alliance alliance) {
        super(camera);
        
        prop = new PropDetection(alliance);
    }
    
    public void init() {
        portal = new VisionPortal.Builder()
                .setCamera(camera)
                .addProcessor(processor)
                .addProcessor(prop)
                .addProcessor(stream)
                .build();
        
        setupCameraSettings();
        
        disablePropDetection();
        
        setupDashboard();
    }
    
    @Override
    public void enablePropDetection() {
        portal.setProcessorEnabled(prop, true);
    }
    
    @Override
    public void disablePropDetection() {
        portal.setProcessorEnabled(prop, false);
    }
}
