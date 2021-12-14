package com.nxb.solidprinciples.ocp.bad

class AreaManager {

    fun calculateArea(vararg shapes: ArrayList<Any?>?): Double {
        var area = 0.0
        for (shape in shapes) {
            when (shape) {
                is Rectangle -> {
                    val (length, height) = shape as Rectangle
                    area += length * height
                }
                is Circle -> {
                    val (radius) = shape as Circle
                    area += radius * shape.radius * Math.PI
                }
                else -> {
                    throw RuntimeException("Shape not supported")
                }
            }
        }
        return area
    }
}