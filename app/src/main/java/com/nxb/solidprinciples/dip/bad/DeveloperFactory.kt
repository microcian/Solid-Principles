package com.nxb.solidprinciples.dip.bad

import com.nxb.solidprinciples.dip.bad.AndroidDeveloper
import com.nxb.solidprinciples.dip.bad.IosDeveloper

object DeveloperFactory {

    fun developerNotes() {
        val androidDeveloper = AndroidDeveloper()
        val iosDeveloper = IosDeveloper()

        androidDeveloper.developMobileApp()
        iosDeveloper.developMobileApp()
    }
}