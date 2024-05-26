package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Speed : UnitDetail {
    const val KM_H = "kilometr na godzinę"
    const val MPH = "mila lądowa na godzinę"
    const val M_S = "metr na sekundę"
    const val KNOT = "węzeł"

    override val title = "Prędkość"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Prędkość"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(KM_H, 0.27777777777778, 3.6),
        UnitFactor(MPH, 0.44704, 2.2369362920544),
        UnitFactor(M_S, 1.0, 1.0),
        UnitFactor(KNOT, 0.51444444444444, 1.9438444924406)
    )
}