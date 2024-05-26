package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Area : UnitDetail {
    const val SQ_KILOMETRES = "kilometr kwadratowy"
    const val SQ_METRES = "metr kwadratowy"
    const val SQ_CENTIMETRES = "centymetr kwadratowy"
    const val HECTARE = "hektar"
    const val SQ_MILE = "mila kwadratowa"
    const val SQ_YARD = "jard kwadratowy"
    const val SQ_FOOT = "stopa kwadratowa"
    const val SQ_INCH = "cal kwadratowy"

    override val title = "Powierzchnia"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Powierzchnia"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(SQ_KILOMETRES, 1000000.0, 0.000001),
        UnitFactor(SQ_METRES, 1.0, 1.0),
        UnitFactor(SQ_CENTIMETRES, 0.0001, 10000.0),
        UnitFactor(HECTARE, 10000.0, 0.0001),
        UnitFactor(SQ_MILE, 2589988.110336, 0.000000386102158542445847),
        UnitFactor(SQ_YARD, 0.83612736, 1.19599004630108026),
        UnitFactor(SQ_FOOT, 0.09290304, 10.7639104167097223),
        UnitFactor(SQ_INCH, 0.00064516, 1550.00310000620001)
    )

}