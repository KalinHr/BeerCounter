package com.example.beercounter

import com.example.beercounter.ICommand as ICommand
import com.example.beercounter.MainActivity.Companion.beerCounter

class AddSmallBeerCommand( beerCounter: BeerCounter ) : ICommand {
    override fun execute() {
        beerCounter.addSmallBeer()
    }

    override fun unexecute() {
        beerCounter.removeSmallBeer()
    }
}