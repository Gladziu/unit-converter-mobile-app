package pl.put.unitconverter

import pl.put.unitconverter.util.data.Temperature
import pl.put.unitconverter.util.UnitDetail
import java.math.BigDecimal


object UnitConverter {

    fun convertUnits(inputValue: String, selectedUnit: UnitDetail, selectedFromUnit: String): MutableMap<String, BigDecimal> {
        val parsedInputValue = inputValue.toDoubleOrNull() ?: return mutableMapOf()
        var baseFactor = selectedUnit.unitConversionFactors.find  { it.name == selectedFromUnit }?.baseUnitFactor ?: return mutableMapOf()

        val result: MutableMap<String, BigDecimal> = mutableMapOf()

        if(selectedUnit.title.equals(Temperature.title)) {
            if (selectedFromUnit.equals(Temperature.FAHRENHEIT)) {
                baseFactor = (parsedInputValue - 32) * 5 / 9
            } else if (selectedFromUnit.equals(Temperature.CELSIUS)) {
                baseFactor = parsedInputValue
            } else if (selectedFromUnit.equals(Temperature.KELVIN)) {
                baseFactor = parsedInputValue - 273.15
            }

            selectedUnit.unitConversionFactors.forEach { unit ->
                if (unit.name != selectedFromUnit) {
                     if(unit.name.equals(Temperature.FAHRENHEIT)) {
                        result[unit.name] = BigDecimal.valueOf(((baseFactor * 9) / 5 + 32))
                    } else if (unit.name.equals(Temperature.CELSIUS)) {
                        result[unit.name] = BigDecimal.valueOf(baseFactor)
                    } else if (unit.name.equals(Temperature.KELVIN)) {
                        result[unit.name] = BigDecimal.valueOf(baseFactor + 273.15)
                    }
                }
            }
            return result
        }

        selectedUnit.unitConversionFactors.forEach { unit ->
            if (unit.name != selectedFromUnit) {
                result[unit.name] = BigDecimal.valueOf((parsedInputValue * baseFactor) * unit.resultUnitFactor)
            }
        }
        return result
    }
}