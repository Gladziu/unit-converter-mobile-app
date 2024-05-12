package pl.put.unitconverter

import pl.put.unitconverter.util.UnitDetail
import java.math.BigDecimal

object UnitConverter {

    fun convertUnits(inputValue: String, selectedUnit: UnitDetail, selectedFromUnit: String): MutableMap<String, BigDecimal> {
        val baseValue = selectedUnit.measurement[selectedFromUnit] ?: return mutableMapOf()
        val parsedInputValue = inputValue.toDoubleOrNull() ?: return mutableMapOf()

        val result: MutableMap<String, BigDecimal> = mutableMapOf()
        selectedUnit.measurement.forEach { (key, value) ->
            if (key != selectedFromUnit) {
                result[key] = BigDecimal.valueOf(parsedInputValue * value / baseValue)
            }
        }
        return result
    }
}