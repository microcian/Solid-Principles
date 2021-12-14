package com.nxb.solidprinciples.lsp.bad

abstract class Vehicle {
    protected var isEngineWorking = false
    abstract fun startEngine()
    abstract fun stopEngine()
    abstract fun moveForward()
    abstract fun moveBack()
}