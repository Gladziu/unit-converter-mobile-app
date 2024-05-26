package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Mass : UnitDetail {
    const val PICOGRAM = "pikogram"
    const val NANOGRAM = "nanogram"
    const val MICROGRAM = "mikrogram"
    const val MILLIGRAM = "miligram"
    const val GRAM = "gram"
    const val DEKAGRAM = "dekagram"
    const val KILOGRAM = "kilogram"
    const val TONNE = "tona"
    const val OUNCE = "uncja"
    const val POUND = "funt"

    override val title = "Masa"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Masa_(fizyka)"
    override var isLiked = false
    override val unitConversionFactors = listOf(
        UnitFactor(PICOGRAM, 1e-15, 1000000000000000.0),
        UnitFactor(NANOGRAM, 1e-12, 1000000000000.0),
        UnitFactor(MICROGRAM, 1e-9, 1000000000.0),
        UnitFactor(MILLIGRAM, 0.000001, 1000000.0),
        UnitFactor(GRAM, 0.001, 1000.0),
        UnitFactor(DEKAGRAM, 0.01, 100.0),
        UnitFactor(KILOGRAM, 1.0, 1.0),
        UnitFactor(TONNE, 1000.0, 0.001),
        UnitFactor(OUNCE, 0.028349523125, 35.27396194958041291568),
        UnitFactor(POUND, 0.45359237, 2.20462262184877581)
    )
}