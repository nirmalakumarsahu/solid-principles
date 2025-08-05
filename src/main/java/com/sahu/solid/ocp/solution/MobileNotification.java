package com.sahu.solid.ocp.solution;

public class MobileNotification implements NotificationService {
    @Override
    public void sendOTP() {
        // Logic using Twilio SMS API
    }

    @Override
    public void sendTransactionNotification() {
        // SMS transaction alert logic
    }
}
