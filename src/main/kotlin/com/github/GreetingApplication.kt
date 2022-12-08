package com.github

import io.quarkus.runtime.Quarkus.run
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class GreetingApplication

fun main(args: Array<String>) {
    run(*args)
}