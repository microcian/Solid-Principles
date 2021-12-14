package com.nxb.solidprinciples.ocp.good

class Rectangle : Shape {
    var length = 0
    var height = 0

    override fun getArea(): Int {
        return (length * height)
    }
}