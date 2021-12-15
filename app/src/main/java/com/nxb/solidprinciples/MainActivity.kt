package com.nxb.solidprinciples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nxb.solidprinciples.lsp.good.Bicycle
import com.nxb.solidprinciples.lsp.good.Car
import com.nxb.solidprinciples.lsp.good.Vehicle
import com.nxb.solidprinciples.ocp.good.AreaFactory
import com.nxb.solidprinciples.ocp.good.Circle
import com.nxb.solidprinciples.ocp.good.Rectangle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AreaFactory.calculateArea(arrayListOf(Rectangle(), Circle()))

        test(Bicycle(), Car())
    }

    fun test(vehicle: Vehicle, vehicleCar: Vehicle) {}
}