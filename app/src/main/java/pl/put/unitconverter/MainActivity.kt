package pl.put.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pl.put.unitconverter.screen.ConversionScreen
import pl.put.unitconverter.screen.UnitListScreen
import pl.put.unitconverter.util.MeasurementUnit
import pl.put.unitconverter.util.UnitDetail


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp(MeasurementUnit.measurementUnits)
        }
    }
}

@Composable
fun MyApp(units: List<UnitDetail>) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "unitList"
    ) {
        composable("unitList") {
            UnitListScreen(units = units) { selectedUnitIndex ->
                navController.navigate("conversion/$selectedUnitIndex")
            }
        }
        composable("conversion/{unitIndex}") { backStackEntry ->
            val unitIndexString = backStackEntry.arguments?.getString("unitIndex")
            val unitIndex = unitIndexString?.toIntOrNull() ?: -1
            ConversionScreen(selectedUnit = MeasurementUnit.measurementUnits.get(unitIndex))
        }
    }
}