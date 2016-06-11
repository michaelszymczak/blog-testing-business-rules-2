package com.michaelszymczak.blog.testingbusinessrules2

import spock.lang.Specification

class TimeDepositShould extends Specification
{
    def "calculate returned amount if cancelled"() {
        expect:
        new TimeDeposit(100).getCurrentAmount() == 100
    }
}
