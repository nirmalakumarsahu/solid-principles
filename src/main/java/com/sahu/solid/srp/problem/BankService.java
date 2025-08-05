package com.sahu.solid.srp.problem;

import com.sahu.solid.constant.LoanType;
import com.sahu.solid.constant.MediumType;

import java.math.BigDecimal;

public class BankService {

    public Long deposit(Long accountId, BigDecimal amount) {
        // deposit logic
        return null;
    }

    public Long withdraw(Long accountId, BigDecimal amount) {
        // withdraw logic
        return null;
    }

    public void printPassbook(Long accountId) {
        // print passbook logic
    }

    public void getLoanInterestDetails(LoanType loanType) {
        // get loan interest details logic
        switch (loanType) {
            case HOME_LOAN:
                System.out.println("Home Loan Interest Rate: 7.5%");
                break;
            case PERSONAL_LOAN:
                System.out.println("Personal Loan Interest Rate: 10.0%");
                break;
            case CAR_LOAN:
                System.out.println("Car Loan Interest Rate: 8.5%");
                break;
            default:
                System.out.println("Unknown loan type.");
        }
    }

    public void sendOTP(MediumType mediumType) {
        // send OTP logic
        switch (mediumType) {
            case EMAIL:
                System.out.println("Sending OTP via Email.");
                break;
            default:
                System.out.println("Unknown OTP medium type.");
        }
    }

}
