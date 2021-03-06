package com.sats.johnnydeep.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.insets.ProvideWindowInsets

@Composable
fun JohnnyDeepTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
  val colors = if (darkTheme) darkColors() else lightColors()

  ProvideWindowInsets {
    MaterialTheme(
      colors = colors,
      content = content,
    )
  }
}
