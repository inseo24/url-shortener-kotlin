package com.example.shortenerkotlin.util

import io.kotest.core.spec.style.BehaviorSpec

class Base62Test : BehaviorSpec({

    given("test data setting") {
        `when`("test case 1 : ") {
            then("should return test data") {
                println("hello")
            }

            then("should return this!") {
                println("bye")
            }
        }

        `when`("test case 2: ") {
            then("should return test data 2"){
                println("hi!!")
            }
        }
    }
})
