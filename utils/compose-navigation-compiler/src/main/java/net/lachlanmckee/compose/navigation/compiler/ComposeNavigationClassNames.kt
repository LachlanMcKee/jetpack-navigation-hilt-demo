package net.lachlanmckee.compose.navigation.compiler

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ClassName.get

object ComposeNavigationClassNames {
  val HILT_COMPOSE_NAVIGATION_FACTORY: ClassName =
    get("net.lachlanmckee.compose.navigation", "HiltComposeNavigationFactory")

  val COMPOSE_NAVIGATION_FACTORY: ClassName =
    get("net.lachlanmckee.compose.navigation", "ComposeNavigationFactory")
}
