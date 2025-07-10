package module1

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoSet
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.IntoSet
import dev.zacsweers.metro.Provides
import dev.zacsweers.metro.binding

@ContributesIntoSet(AppScope::class, binding<Handler>())
@Inject
internal class InternalContributesHandler : Handler

@ContributesIntoSet(AppScope::class, binding<Handler>())
@Inject
class PublicContributesHandler : Handler
