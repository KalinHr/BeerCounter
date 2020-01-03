package com.example.beercounter

interface ICommand {
    fun execute()
    fun unexecute()
}