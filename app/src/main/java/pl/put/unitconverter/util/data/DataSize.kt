package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object DataSize : UnitDetail {
    const val BIT = "bit"
    const val BYTE = "bajt"
    const val KILOBIT = "kilobit"
    const val KILOBYTE = "kilobajt"
    const val MEGABIT = "megabit"
    const val MEGABYTE = "megabajt"
    const val GIGABIT = "gigabit"
    const val GIGABYTE = "gigabajt"
    const val TERABIT = "terabit"
    const val TERABYTE = "terabajt"

    override val title = "Rozmiary danych"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Jednostka_informacji"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(BIT, 0.00000011920928955078, 8388608.0),
        UnitFactor(BYTE, 0.00000095367431640625, 1048576.0),
        UnitFactor(KILOBIT, 0.0001220703125, 8192.0),
        UnitFactor(KILOBYTE, 0.0009765625, 1024.0),
        UnitFactor(MEGABIT, 0.125, 8.0),
        UnitFactor(MEGABYTE, 1.0, 1.0),
        UnitFactor(GIGABIT, 128.0, 0.0078125),
        UnitFactor(GIGABYTE, 1024.0, 0.0009765625),
        UnitFactor(TERABIT, 131072.0, 0.00000762939453125),
        UnitFactor(TERABYTE, 1048576.0, 0.00000095367431640625)
    )
}