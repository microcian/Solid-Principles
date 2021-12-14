package com.nxb.solidprinciples.ocp.good

class AreaManager {

    fun calculateArea(vararg shapes: ArrayList<Any?>?): Double {
        var area = 0.0

        for (shape: Shape in shapes) {
            area += shape.getArea()
        }

        return area
    }
}