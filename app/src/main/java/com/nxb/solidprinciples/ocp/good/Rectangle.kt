package com.nxb.solidprinciples.ocp.good

class Rectangle : Shape {
    var length = 0.0
    var height = 0.0

    override fun getArea(): Double {
        return (length * height)
    }
}