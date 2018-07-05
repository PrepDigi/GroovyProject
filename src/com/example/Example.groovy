package com.example

class Example {

    def static execute(){
        def myList = ["Digs", "Deval", "Vina"]

        myList.each {name->
            println(name)
        }
    }
    static void main(String[] args){

        def x = 15

        println("Hello World ! Really ! ${x}" )

        execute()

    }
}
