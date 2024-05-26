package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Sound : UnitDetail {
    const val DECIBEL = "decybel"
    const val BEL = "bel"
    const val NEPER = "neper"

    override val title = "Dźwięk"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Dźwięk"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(DECIBEL, 1.0, 1.0),
        UnitFactor(BEL, 0.1, 10.0),
        UnitFactor(NEPER, 0.115129254, 8.685889638065036)
    )
}