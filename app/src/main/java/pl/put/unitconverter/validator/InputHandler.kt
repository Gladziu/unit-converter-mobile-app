package pl.put.unitconverter.validator

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.data.Temperature

object InputHandler {
    fun validateInputValue(selectedUnit: UnitDetail, newValue: String): String? {
        val newValueAsNumber = newValue.toFloatOrNull()

        if (selectedUnit.title == Temperature.title) {
            if (newValue.isTemperatureInputValid()) {
                return newValue
            }
        } else {
            if ((newValueAsNumber != null && newValueAsNumber >= 0) || newValue.isEmpty()) {
                if (newValue.isInputValid()) {
                    return newValue
                }
            }
        }
        return null
    }
}
fun String.isTemperatureInputValid(): Boolean {
    val regex = Regex("^-?\\d*\\.?\\d*\$")
    return regex.matches(this)
}

fun String.isInputValid(): Boolean {
    val regex = Regex("\\d*\\.?\\d*\$")
    return regex.matches(this)
}