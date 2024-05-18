package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Temperature : UnitDetail {
    const val KELVIN = "Kelwin"
    const val CELSIUS = "Celsjusz"
    const val FAHRENHEIT = "Fahrenheit"

    override val title = "Temperatura"
    override val unitConversionFactors = listOf(
        UnitFactor(KELVIN, 1.0, 1.0),
        UnitFactor(CELSIUS, 1.0, 1.0),
        UnitFactor(FAHRENHEIT, 1.0, 1.0)
    )
}