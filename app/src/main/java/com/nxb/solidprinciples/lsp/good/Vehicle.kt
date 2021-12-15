package com.nxb.solidprinciples.lsp.good

interface Vehicle {
    fun moveForward() {
        println("Engine started")
    }
    fun moveBack()
}