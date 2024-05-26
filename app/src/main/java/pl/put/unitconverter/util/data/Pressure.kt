package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Pressure : UnitDetail {
    const val MEGAPASCAL = "megapascal"
    const val KILOPASCAL = "kilopascal"
    const val PASCAL = "pascal"
    const val BAR = "bar"
    const val PSI = "psi"
    const val PSF = "psf"
    const val ATMOSPHERE = "atmosfera"
    const val TECHNICAL_ATMOSPHERE = "atmosfera_techniczna"

    override val title = "Ciśnienie"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Ciśnienie"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(MEGAPASCAL, 1000000.0, 0.000001),
        UnitFactor(KILOPASCAL, 1000.0, 0.001),
        UnitFactor(PASCAL, 1.0, 1.0),
        UnitFactor(BAR, 100000.0, 0.00001),
        UnitFactor(PSI, 6894.757293168361, 0.000145037737730209222),
        UnitFactor(PSF, 47.88025898033584, 0.020885434233150127968),
        UnitFactor(ATMOSPHERE, 101325.0, 0.0000098692326671601283),
        UnitFactor(TECHNICAL_ATMOSPHERE, 98066.5, 0.0000101971621297792824257)
    )
}