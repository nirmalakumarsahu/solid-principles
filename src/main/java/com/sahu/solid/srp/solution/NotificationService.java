package com.sahu.solid.srp.solution;

import com.sahu.solid.constant.OTPMediumType;

public class NotificationService {
    public void sendOTP(OTPMediumType otpMediumType) {
        // send OTP logic
        switch (otpMediumType) {
            case EMAIL:
                System.out.println("Sending OTP via Email.");
                break;
            default:
                System.out.println("Unknown OTP medium type.");
        }
    }
}
