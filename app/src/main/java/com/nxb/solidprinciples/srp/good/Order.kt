package com.nxb.solidprinciples.srp.good

data class Order(val orderNumber: Int = 0, val totalNumber: Int = 0, val lineItems: List<LineItem>)
