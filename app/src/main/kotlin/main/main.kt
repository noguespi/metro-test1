package main

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Multibinds
import dev.zacsweers.metro.createGraph
import module1.FooProvider
import module1.Handler


@DependencyGraph
interface ViaProvider : FooProvider {
    @Multibinds
    val handlers: Set<Handler>
}

@DependencyGraph(AppScope::class)
interface ViaContributes {
    @Multibinds
    val handlers: Set<Handler>
}

fun main() {
    createGraph<ViaProvider>().let {
        println("ViaProvider: ${it.handlers}")
    }

    createGraph<ViaContributes>().let {
        println("ViaContributeIntoSet: ${it.handlers}")
    }
}