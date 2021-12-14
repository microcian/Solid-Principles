package com.nxb.solidprinciples.srp.bad

class Employee {

    /*
    There are two responsibilities in the class
    */

    fun calculatePay(_money: Money) {
        // business logic for the payment here
    }

    fun save(_employee: Employee): Employee {
        // store employee here
        return _employee
    }
}