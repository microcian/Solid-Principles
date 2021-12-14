package com.nxb.solidprinciples.ocp.good

class Circle : Shape {
    private var radius = 0.0

    override fun getArea(): Double {
        return (radius * radius * Math.PI)
    }
}