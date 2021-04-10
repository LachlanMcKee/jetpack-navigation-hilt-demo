package net.lachlanmckee.jetpack.navigation.hilt.feature.feature2.di

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import net.lachlanmckee.hilt.compose.navigation.factory.ComposeNavigationFactory
import net.lachlanmckee.hilt.compose.navigation.factory.HiltComposeNavigationFactory
import net.lachlanmckee.hilt.compose.navigation.factory.viewModelComposable
import net.lachlanmckee.jetpack.navigation.hilt.feature.feature2.Feature2ViewModel
import net.lachlanmckee.jetpack.navigation.hilt.feature.feature2.ui.Feature2
import javax.inject.Inject

@HiltComposeNavigationFactory
internal class Feature2ComposeNavigationFactory @Inject constructor() : ComposeNavigationFactory {
  override fun create(builder: NavGraphBuilder, navController: NavHostController) {
    builder.viewModelComposable<Feature2ViewModel>(
      route = "feature2",
      content = {
        Feature2(
          viewModel = this,
          navController = navController
        )
      }
    )
  }
}
