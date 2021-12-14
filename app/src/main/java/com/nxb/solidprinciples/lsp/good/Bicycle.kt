package com.nxb.solidprinciples.lsp.good

class Bicycle : Vehicle {
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}