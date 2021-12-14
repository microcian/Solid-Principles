package com.nxb.solidprinciples.ocp.good

object AreaFactory {
    fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area = 0.0
        shapes.forEach { shape ->
            area += shape.getArea()
        }
        return area
    }
}