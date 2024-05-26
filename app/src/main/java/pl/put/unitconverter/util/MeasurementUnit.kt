package pl.put.unitconverter.util

import pl.put.unitconverter.util.data.Area
import pl.put.unitconverter.util.data.DataSize
import pl.put.unitconverter.util.data.Energy
import pl.put.unitconverter.util.data.Length
import pl.put.unitconverter.util.data.Mass
import pl.put.unitconverter.util.data.Power
import pl.put.unitconverter.util.data.Pressure
import pl.put.unitconverter.util.data.Sound
import pl.put.unitconverter.util.data.Speed
import pl.put.unitconverter.util.data.Temperature
import pl.put.unitconverter.util.data.Time
import pl.put.unitconverter.util.data.Volume

class MeasurementUnit {
    companion object {
        val measurementUnits: List<UnitDetail> = listOf(
            Area,
            DataSize,
            Energy,
            Length,
            Mass,
            Power,
            Pressure,
            Sound,
            Speed,
            Temperature,
            Time,
            Volume
        )

        fun areAllNotLiked(): Boolean {
            measurementUnits.forEach { unitDetail ->
                if (unitDetail.isLiked) {
                    return false
                }
            }
            return true
        }
    }
}