package com.nxb.solidprinciples.dip.good

import com.nxb.solidprinciples.dip.bad.AndroidDeveloper
import com.nxb.solidprinciples.dip.bad.IosDeveloper

object DeveloperFactory {

    fun developerNotes(developers: ArrayList<Any>) {
//        val developers = arrayListOf(AndroidDeveloper(), IosDeveloper())
        developers.forEach { developer ->
            if (developer is com.nxb.solidprinciples.dip.good.IosDeveloper)
                developer.developMobileApp()
        }
    }
}