package pl.put.unitconverter.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.put.unitconverter.R
import pl.put.unitconverter.util.MeasurementUnit

@Composable
fun FavouriteUnitListScreen(onItemClick: (Int) -> Unit) {
    Box() {
        if(MeasurementUnit.areAllNotLiked()) {
            Text(text = "Brak ulubionych jednostek ...",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Gray,
                modifier = Modifier.padding(start = 18.dp))
        }
        LazyColumn(Modifier.fillMaxWidth()) {
            itemsIndexed(MeasurementUnit.measurementUnits) { index, unit ->
                // Pamiętaj stan isLiked dla każdego elementu
                var isLiked by remember { mutableStateOf(unit.isLiked) }

                if (isLiked) {
                    Row(
                        modifier = Modifier
                            .padding(9.dp)
                            .fillMaxWidth()
                            .clickable { onItemClick(index) }
                            .clip(RoundedCornerShape(16.dp))
                            .background(color = MaterialTheme.colorScheme.primary),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = unit.title,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onPrimary,
                            modifier = Modifier.padding(start = 8.dp))
                        Spacer(modifier = Modifier.weight(1f))
                        // Ikona serduszka
                        IconButton(onClick = {
                            isLiked = !isLiked
                            unit.isLiked = isLiked
                        }) {
                            val imageIcon = if (isLiked) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder
                            val iconColor = if (isLiked) Color.Red else Color.Gray
                            Icon(
                                imageVector = imageIcon,
                                contentDescription = "Delete from favourite",
                                tint = iconColor
                            )
                        }
                    }
                }
            }
        }
    }
}
