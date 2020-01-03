package com.example.beercounter

class BeerCounter {
    var largeBeers = 0
    var smallBeers = 0

    fun addLargeBeer() {
        largeBeers++
    }

    fun removeLargeBeer() {
        largeBeers--
    }

    fun addSmallBeer() {
        smallBeers++
    }

    fun removeSmallBeer() {
        smallBeers--
    }

    fun kiloliters():Int {
        return liters() / 1000
    }

    fun liters():Int {
        return milliliters() / 1000
    }

    fun  milliliters() : Int {
        return largeBeers * 500 + smallBeers * 330
    }
}