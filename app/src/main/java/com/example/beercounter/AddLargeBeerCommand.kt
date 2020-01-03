package com.example.beercounter

import com.example.beercounter.ICommand as ICommand
import com.example.beercounter.MainActivity.Companion.beerCounter

class AddLargeBeerCommand( beerCounter: BeerCounter ) : ICommand {
    override fun execute() {
        beerCounter.addLargeBeer()
    }

    override fun unexecute() {
        beerCounter.removeLargeBeer()
    }
}