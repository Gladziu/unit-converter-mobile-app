package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Volume : UnitDetail {
    const val TEASPOON = "łyżeczka"
    const val TABLESPOON = "łyżka"
    const val QUART = "kwarta USA"
    const val QUART_UK = "kwarta ang"
    const val GALLON = "galon USA"
    const val GALLON_UK = "galon ang"
    const val BARREL = "baryłka USA"
    const val BARREL_UK = "baryłka ang"
    const val MILLILITRE = "mililitr"
    const val LITRE = "litr"
    const val CUBIC_CM = "centymetr sześcienny"
    const val CUBIC_DM  ="decymetr sześcienny"
    const val CUBIC_M = "metr sześcienny"

    override val title = "Objętość"
    override val wikiUrl = "https://pl.wikipedia.org/wiki/Objętość"
    override var isLiked = false
    override val unitConversionFactors: List<UnitFactor> = listOf(
        UnitFactor(TEASPOON, 0.0000049289215938, 202884.136211058),
        UnitFactor(TABLESPOON, 0.0000147867647812, 67628.045403686),
        UnitFactor(QUART, 0.000946352946, 1056.68820943259366),
        UnitFactor(QUART_UK, 0.0011365225, 879.8769931963511501092),
        UnitFactor(GALLON, 0.003785411784, 264.172052358148415),
        UnitFactor(GALLON_UK, 0.00454609, 219.9692482990877875273),
        UnitFactor(BARREL, 0.119240471196, 8.38641436057614017079),
        UnitFactor(BARREL_UK, 0.16365924, 6.11025689719688298687),
        UnitFactor(MILLILITRE, 0.000001, 1000000.0),
        UnitFactor(LITRE, 0.001, 1000.0),
        UnitFactor(CUBIC_CM, 0.000001, 1000000.0),
        UnitFactor(CUBIC_DM, 0.001, 1000.0),
        UnitFactor(CUBIC_M, 1.0, 1.0)
    )
}