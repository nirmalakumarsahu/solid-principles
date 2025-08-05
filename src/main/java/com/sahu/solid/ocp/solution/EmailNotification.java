package com.sahu.solid.ocp.solution;

public class EmailNotification implements NotificationService {
    @Override
    public void sendOTP() {
        // Logic using JavaMail API
    }

    @Override
    public void sendTransactionNotification() {
        // Logic to send email transaction alert
    }
}
