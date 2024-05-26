package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Energy : UnitDetail {
    const val JOULE = "joule"
    const val KILOJOULE = "kilojoule"
    const val CALORIE = "kaloria"
    const val KILOCALORIE = "kilokaloria"
    const val KILOWATT_HOUR = "kilowatogodzina"

    override val title = "Energia"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Energia_(fizyka)"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(JOULE, 1.0, 1.0),
        UnitFactor(KILOJOULE, 1000.0, 0.001),
        UnitFactor(CALORIE, 4.184, 0.2390057361376673040153),
        UnitFactor(KILOCALORIE, 4184.0, 0.0002390057361376673040153),
        UnitFactor(KILOWATT_HOUR, 3600000.0, 0.0000002777777777777777777778)
    )
}