package pl.put.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pl.put.unitconverter.screen.ConversionScreen
import pl.put.unitconverter.screen.MainScreen
import pl.put.unitconverter.screen.UnitListScreen
import pl.put.unitconverter.util.MeasurementUnit
import pl.put.unitconverter.util.UnitDetail


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppNavigation(navController = navController)
        }
    }
}