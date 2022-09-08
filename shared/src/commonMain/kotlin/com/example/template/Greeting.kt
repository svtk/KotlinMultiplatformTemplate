package com.example.template

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}