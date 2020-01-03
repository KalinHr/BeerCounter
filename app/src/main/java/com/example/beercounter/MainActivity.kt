package com.example.beercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val PREFS_FILENAME = "beerCounterDetails"

    companion object {
        var beerCounter : BeerCounter = BeerCounter()
    }

    var addLargeBeerCommand : ICommand = AddLargeBeerCommand( beerCounter )
    var addSmallBeerCommand : ICommand = AddSmallBeerCommand( beerCounter )
    val commands = Stack<ICommand>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print()

        addLargeBeer.setOnClickListener {
            commands.add( addLargeBeerCommand )
            commands.peek().execute()

            print()
        }

        addSmallBeer.setOnClickListener {
            commands.add( addSmallBeerCommand )
            commands.peek().execute()

            print()
        }

        undo.setOnClickListener {
            commands.pop().unexecute()

            print()
        }
    }

    fun print() {
        largeBeerCounter.setText( "" + beerCounter.largeBeers )
        smallBeerCounter.setText( "" + beerCounter.smallBeers )
        kilolitersCounter.setText( "" + beerCounter.kiloliters() + " kl" )
        litersCounter.setText( "" + beerCounter.liters() % 1000 + " l" )
        millilitersCounter.setText( "" + beerCounter.milliliters() % 1000 + " ml" )
    }
}