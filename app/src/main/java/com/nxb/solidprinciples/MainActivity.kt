package com.nxb.solidprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nxb.solidprinciples.dip.bad.AndroidDeveloper
import com.nxb.solidprinciples.dip.bad.IosDeveloper
import com.nxb.solidprinciples.ocp.good.AreaFactory
import com.nxb.solidprinciples.ocp.good.Circle
import com.nxb.solidprinciples.ocp.good.Rectangle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AreaFactory.calculateArea(arrayListOf(Rectangle(), Circle()))
    }
}