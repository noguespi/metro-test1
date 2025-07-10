package module1

import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.IntoSet
import dev.zacsweers.metro.Provides

@Inject
internal class InternalProviderHandler : Handler
@Inject
class PublicProviderHandler : Handler

interface FooProvider {
    @Provides
    @IntoSet
    fun InternalProviderHandler(handler: InternalProviderHandler): Handler = handler

    @Provides
    @IntoSet
    fun PublicProviderHandler(handler: PublicProviderHandler): Handler = handler
}
