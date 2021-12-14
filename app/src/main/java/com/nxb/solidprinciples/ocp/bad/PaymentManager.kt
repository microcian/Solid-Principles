package com.nxb.solidprinciples.ocp.bad

class PaymentManager {

    fun pay(paymentOptions: PaymentOptions) {
        if (paymentOptions == PaymentOptions.CASH) {
            // Some code here - pay with cash
        } else {
            // Some code here - pay with credit card
        }
    }
}