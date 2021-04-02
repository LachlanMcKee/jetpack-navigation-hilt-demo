package net.lachlanmckee.jetpack.navigation.hilt.feature.feature1.di

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import net.lachlanmckee.compose.navigation.ComposeNavigationFactory
import net.lachlanmckee.compose.navigation.viewModelComposable
import net.lachlanmckee.jetpack.navigation.hilt.feature.feature1.Feature1ViewModel
import net.lachlanmckee.jetpack.navigation.hilt.feature.feature1.ui.Feature1
import javax.inject.Inject
import javax.inject.Singleton

internal class Feature1ComposeNavigationFactory @Inject constructor() : ComposeNavigationFactory {
  override fun create(builder: NavGraphBuilder, navController: NavHostController) {
    builder.viewModelComposable<Feature1ViewModel>(
      route = "feature1",
      content = {
        Feature1(
          viewModel = this,
          navController = navController
        )
      }
    )
  }
}

@Module
@InstallIn(SingletonComponent::class)
internal interface ComposeNavigationFactoryModule {
  @Singleton
  @Binds
  @IntoSet
  fun bindComposeNavigationFactory(factory: Feature1ComposeNavigationFactory): ComposeNavigationFactory
}
