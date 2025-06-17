package test

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.createGraph
import main.MainGraph
import main.MainProvider

@DependencyGraph(AppScope::class)
interface TestGraph : MainProvider {
}

fun main() {
    val testGraph = createGraph<TestGraph>()
    println("test:${testGraph.handlers}")
}