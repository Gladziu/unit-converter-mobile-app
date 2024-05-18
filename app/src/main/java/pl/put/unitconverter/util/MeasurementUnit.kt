package pl.put.unitconverter.util

import pl.put.unitconverter.util.data.Length
import pl.put.unitconverter.util.data.Mass
import pl.put.unitconverter.util.data.Temperature

class MeasurementUnit {
    companion object {
        val measurementUnits: List<UnitDetail> = listOf(Length, Mass, Temperature)
    }
}