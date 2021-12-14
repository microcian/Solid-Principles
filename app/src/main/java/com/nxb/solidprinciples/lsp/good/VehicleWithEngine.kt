package com.nxb.solidprinciples.lsp.good

abstract class VehicleWithEngine : Vehicle {
    private var isEngineWorking = false
    open fun startEngine() {
        isEngineWorking = true
    }

    open fun stopEngine() {
        isEngineWorking = false
    }
}