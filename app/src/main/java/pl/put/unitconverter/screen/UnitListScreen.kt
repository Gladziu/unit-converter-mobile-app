package pl.put.unitconverter.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pl.put.unitconverter.util.UnitDetail

@Composable
fun UnitListScreen(units: List<UnitDetail>, onItemClick: (Int) -> Unit) {
    Box() {
        LazyColumn(Modifier.fillMaxWidth()) {
            itemsIndexed(units) { index, unit ->
                Text(
                    text = unit.title,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clickable { onItemClick(index) } // Przekazanie wybranej jednostki
                )
            }
        }
    }
}