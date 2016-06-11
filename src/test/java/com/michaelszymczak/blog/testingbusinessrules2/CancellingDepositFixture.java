package com.michaelszymczak.blog.testingbusinessrules2;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CancellingDepositFixture {

    public Result cancel(int lengthInYears, int initialAmount, int interestRate, int cancelledAfterMonths, int cancelledAfterDays) {
        return Result.of(initialAmount); // A
    }

    static class Result {

        public final String amountTransferred; // B

        public static Result of(int amountTransferred) // C
        {
            return new Result(String.valueOf(amountTransferred)); // D
        }

        private Result(String amountTransferred)
        {
            this.amountTransferred = amountTransferred;
        }
    }
}