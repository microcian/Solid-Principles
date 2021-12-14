package com.nxb.solidprinciples.ocp.good


data class Circle(val radius: Double) : Shape {

    override fun getArea(): Double {
        return (radius * radius * Math.PI)
    }
}