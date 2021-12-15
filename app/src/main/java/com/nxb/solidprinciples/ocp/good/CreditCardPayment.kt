package com.nxb.solidprinciples.ocp.good

class CreditCardPayment: Payment() {

    override fun pay() {
        // Some code here - pay with credit card
    }

}