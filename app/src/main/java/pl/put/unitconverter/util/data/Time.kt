package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Time : UnitDetail {
    const val YEAR = "rok"
    const val MONTH = "miesiąc"
    const val WEEK = "tydzień"
    const val DAY = "dzień"
    const val HOUR = "godzina"
    const val MINUTE = "minuta"
    const val SECOND = "sekunda"
    const val MILLISECOND = "milisekunda"
    const val NANOSECOND = "nanosekunda"

    override val title = "Czas"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Czas"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(YEAR, 31536000.0, 0.0000000317097919837645865),
        UnitFactor(MONTH, 2628000.0, 0.0000003805175),
        UnitFactor(WEEK, 604800.0, 0.00000165343915343915344),
        UnitFactor(DAY, 86400.0, 0.0000115740740740740741),
        UnitFactor(HOUR, 3600.0, 0.000277777777777777778),
        UnitFactor(MINUTE, 60.0, 0.0166666666666666667),
        UnitFactor(SECOND, 1.0, 1.0),
        UnitFactor(MILLISECOND, 0.001, 1000.0),
        UnitFactor(NANOSECOND, 0.000000001, 1000000000.0)
    )
}