package net.lachlanmckee.compose.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NamedNavArgument
import androidx.navigation.compose.composable

inline fun <reified VM> NavGraphBuilder.viewModelComposable(
  route: String,
  arguments: List<NamedNavArgument> = emptyList(),
  deepLinks: List<NavDeepLink> = emptyList(),
  crossinline content: @Composable VM.(NavBackStackEntry) -> Unit
) where VM : ViewModel {

  composable(route, arguments, deepLinks) { navBackStackEntry ->
    content(hiltNavGraphViewModel(), navBackStackEntry)
  }
}
