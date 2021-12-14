package com.nxb.solidprinciples.dip.bad

object DeveloperFactory {

    fun developerNotes() {
        val androidDeveloper = AndroidDeveloper()
        val iosDeveloper = IosDeveloper()

        androidDeveloper.developMobileApp()
        iosDeveloper.developMobileApp()
    }
}