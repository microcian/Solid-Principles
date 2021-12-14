package com.nxb.solidprinciples.lsp.bad

class Bicycle : Vehicle() {
    override fun startEngine() {
    }

    override fun stopEngine() {
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}