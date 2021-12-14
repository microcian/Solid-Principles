package com.nxb.solidprinciples.isp.good

import android.view.MotionEvent
import android.view.View

interface OnTouch {
    fun onTouch(v: View?, event: MotionEvent?)
}