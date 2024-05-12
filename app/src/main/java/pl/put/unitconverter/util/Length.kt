package pl.put.unitconverter.util

class Length : UnitDetail {
    override val title = "Długość"
    override val measurement = mapOf(
        "centymetr" to 100.0,
        "metr" to 1.0,
        "kilometr" to 0.001
    )
}