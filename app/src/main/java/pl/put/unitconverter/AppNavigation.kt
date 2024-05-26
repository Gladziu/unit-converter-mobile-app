package pl.put.unitconverter
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pl.put.unitconverter.screen.ConversionScreen
import pl.put.unitconverter.screen.FavouriteUnitListScreen
import pl.put.unitconverter.screen.MainScreen
import pl.put.unitconverter.screen.UnitListScreen
import pl.put.unitconverter.util.MeasurementUnit

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen(navController)
        }
        composable("unitList") {
            UnitListScreen() { selectedUnitIndex ->
                navController.navigate("conversion/$selectedUnitIndex")
            }
        }
        composable("favouriteUnitList") {
            FavouriteUnitListScreen() { selectedUnitIndex ->
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