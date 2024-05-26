package pl.put.unitconverter.util

interface UnitDetail {
    val title: String
    val wikiUrl: String
    var isLiked: Boolean
    val unitConversionFactors: List<UnitFactor>
}
