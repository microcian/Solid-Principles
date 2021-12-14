package com.nxb.solidprinciples.isp.bad

class Cat : Animal {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }

    override fun fly() {
         // Cats can't fly
    }
}