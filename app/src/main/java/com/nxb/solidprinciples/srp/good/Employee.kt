package com.nxb.solidprinciples.srp.good

import com.nxb.solidprinciples.srp.bad.Money

class Employee {

    fun calculatePay(_money: Money) {
        // business logic for the payment here
    }

    fun save(_employee: Employee): Employee {
        // store employee here
        return _employee
    }
}