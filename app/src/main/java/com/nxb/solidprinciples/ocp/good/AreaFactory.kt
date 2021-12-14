package com.nxb.solidprinciples.ocp.good

object AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        shapes.forEach { shape ->
            if (shape is Rectangle)
                area += shape.getArea()
            if (shape is Circle)
                area += shape.getArea()
        }
        return area
    }
}