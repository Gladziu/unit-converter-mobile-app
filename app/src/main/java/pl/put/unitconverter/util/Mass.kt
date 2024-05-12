package pl.put.unitconverter.util

class Mass : UnitDetail {
    override val title = "Masa"
    override val measurement = mapOf(
        "gram" to 1000.0,
        "kilogram" to 1.0,
        "tona" to 0.001
    )
}