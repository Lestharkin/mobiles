package edu.upb.tetris.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Cell(
    modifier: Modifier = Modifier,
    cellSize: Int = 24,
    color: Color = Color.DarkGray
) {
    Box (
        modifier = Modifier
            .size(cellSize.dp)
            .background(color)
            .border(1.dp, Color.Black)
    ) {}
}

@Preview(showBackground = true)
@Composable
fun CellPreview() {
    Cell()
}
