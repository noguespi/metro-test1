package main

import dev.zacsweers.metro.*

interface Handler<GENERIC> {
    fun handle(param: GENERIC): Unit
}

interface MainProvider {
    @Multibinds(allowEmpty = true)
    val handlers: Set<Handler<*>>
}

@ContributesIntoSet(AppScope::class, binding = binding<Handler<*>>())
@Inject
internal class Foo() : Handler<String> {
    override fun handle(param: String) = TODO()
}

@ContributesIntoSet(AppScope::class, binding = binding<Handler<*>>())
@Inject
class Bar() : Handler<Int> {
    override fun handle(param: Int) = TODO()
}

@DependencyGraph(AppScope::class)
internal interface MainGraph : MainProvider {
}

fun main() {
    val graph = createGraph<MainGraph>()
    println("main: ${graph.handlers}")
}