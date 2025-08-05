package com.sahu.solid.srp.solution;

import com.sahu.solid.constant.LoanType;

public class LoanService {
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
}
