package pl.put.unitconverter.util

class MeasurementUnit {
    companion object {
        val measurementUnits: List<UnitDetail> = listOf(Length(), Mass())
    }
}