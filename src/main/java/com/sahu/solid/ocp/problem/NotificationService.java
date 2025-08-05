package com.sahu.solid.ocp.problem;

import com.sahu.solid.constant.MediumType;

public class NotificationService {
    public void sendOTP(MediumType mediumType) {
        // send OTP logic
        switch (mediumType) {
            case EMAIL:
                System.out.println("Sending OTP via Email.");
                break;
            case SMS:
                System.out.println("Sending OTP via SMS.");
                break;
            default:
                System.out.println("Unknown OTP medium type.");
        }
    }
}
