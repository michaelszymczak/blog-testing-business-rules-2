package com.michaelszymczak.blog.testingbusinessrules2.acceptancetests;

import com.michaelszymczak.blog.testingbusinessrules2.TimeDeposit;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CancellingDepositFixture {

    public Result cancel(int lengthInYears, int initialAmount, int interestRate, int cancelledAfterMonths, int cancelledAfterDays) {
        TimeDeposit timeDeposit = new TimeDeposit(initialAmount);

        return Result.of(timeDeposit.getCurrentAmount());
    }

    static class Result {

        public final String amountTransferred;

        public static Result of(int amountTransferred)
        {
            return new Result(String.valueOf(amountTransferred));
        }

        private Result(String amountTransferred)
        {
            this.amountTransferred = amountTransferred;
        }
    }
}