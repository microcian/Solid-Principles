package com.nxb.solidprinciples.dip.good

object DeveloperFactory {

    fun developerNotes(developers: ArrayList<MobileDeveloper>) {
        developers.forEach { developer ->
            developer.developMobileApp()
        }
    }
}