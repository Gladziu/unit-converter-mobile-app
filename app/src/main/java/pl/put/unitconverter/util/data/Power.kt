package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Power : UnitDetail {
    const val WATT = "watt"
    const val KILOWATT = "kilowatt"
    const val MEGAWATT = "megawatt"
    const val HP = "hpm"
    const val HP_UK = "angielski koń parowy"

    override val title = "Moc"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Moc"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(WATT, 1.0, 1.0),
        UnitFactor(KILOWATT, 1000.0, 0.001),
        UnitFactor(MEGAWATT, 1000000.0, 0.000001),
        UnitFactor(HP, 735.49875, 0.00135962161730390432),
        UnitFactor(HP_UK, 745.69987158227022, 0.00134102208959502793)
    )
}