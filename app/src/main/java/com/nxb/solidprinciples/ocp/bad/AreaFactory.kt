package com.nxb.solidprinciples.ocp.bad

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        for (shape in shapes) {
            if (shape is Rectangle) {
                val rect = shape
                area += (rect.length * rect.height)
            } else if (shape is Circle) {
                val circle = shape
                area += (circle.radius * circle.radius * Math.PI);
            }
        }
        return area
    }
}