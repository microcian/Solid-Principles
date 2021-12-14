package com.nxb.solidprinciples.ocp.good


data class Rectangle(val length: Double, val height: Double) : Shape {

    override fun getArea(): Double {
        return (length * height)
    }
}