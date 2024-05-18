package pl.put.unitconverter.util.data

import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.util.UnitFactor

object Length : UnitDetail {
    const val NANOMETER = "nanometr"
    const val MICROMETER = "mikrometr"
    const val MILLIMETER = "milimetr"
    const val CENTIMETER = "centymetr"
    const val DECIMETER = "decymetr"
    const val METER = "metr"
    const val KILOMETER = "kilometr"
    const val INCH = "cal"
    const val FOOT = "stopa"
    const val YARD = "jard"
    const val MILE = "mila"
    const val ASTRONOMICAL_UNIT = "jednostka astronomiczna"
    const val LIGHT_YEAR = "rok świetlny"

    override val title = "Długość"
    override val unitConversionFactors = listOf(
        UnitFactor(NANOMETER, 0.000000001, 1000000000.0),
        UnitFactor(MICROMETER, 0.000001, 1000000.0),
        UnitFactor(MILLIMETER, 0.001, 1000.0),
        UnitFactor(CENTIMETER, 0.01, 100.0),
        UnitFactor(DECIMETER, 0.1, 10.0),
        UnitFactor(METER, 1.0, 1.0),
        UnitFactor(KILOMETER, 1000.0, 0.001),
        UnitFactor(INCH, 0.0254, 39.3700787401574803),
        UnitFactor(FOOT, 0.3048, 3.28083989501312336),
        UnitFactor(YARD, 0.9144, 1.09361329833770779),
        UnitFactor(MILE, 1609.344, 0.00062137119223733397),
        UnitFactor(ASTRONOMICAL_UNIT, 149597870700.0, 0.00000000000668458712),
        UnitFactor(LIGHT_YEAR, 9460730472580800.0, 0.0000000000000001057000834024615463709)
    )
}