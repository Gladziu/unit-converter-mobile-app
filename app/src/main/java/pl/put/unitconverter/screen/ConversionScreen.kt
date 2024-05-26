package pl.put.unitconverter.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import pl.put.unitconverter.UnitConverter
import pl.put.unitconverter.util.UnitDetail
import pl.put.unitconverter.validator.InputHandler
import java.math.BigDecimal
import java.text.DecimalFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConversionScreen(selectedUnit: UnitDetail) {
    var inputValue by remember { mutableStateOf("") }
    var selectedFromUnit by remember { mutableStateOf("Wejsciowa jednostka") }
    var isExpanded by remember { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current
    val result = UnitConverter.convertUnits(inputValue, selectedUnit, selectedFromUnit)

    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = selectedUnit.title,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )

            Button(
                onClick = {
                    uriHandler.openUri(selectedUnit.wikiUrl)
                },
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Text("Wiki")
            }
        }

        OutlinedTextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = InputHandler.validateInputValue(selectedUnit, newValue) ?: inputValue
            },
            label = { Text("Podaj wartosc") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = { isExpanded = !isExpanded }
        ) {
            TextField(
                modifier = Modifier.menuAnchor(),
                value = selectedFromUnit,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) }
            )
            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
            ) {
                selectedUnit.unitConversionFactors.forEach() { unit ->
                    DropdownMenuItem(
                        text = { Text(text = unit.name) },
                        onClick = {
                            selectedFromUnit = unit.name
                            isExpanded = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }

        val df = DecimalFormat("0.00E0")
        result.forEach { (key, value) ->
            val formattedValue = if (value > BigDecimal.valueOf(0.000001)
                || value < BigDecimal.valueOf(1000000000)) {
                value
            } else {
                df.format(value)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = key,
                    style = MaterialTheme.typography.labelLarge
                )
                Text(text = " $formattedValue")
            }
            Divider(color = Color.Gray, thickness = 1.dp)
        }
    }
}