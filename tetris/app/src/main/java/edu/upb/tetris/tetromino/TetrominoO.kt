package edu.upb.tetris.tetromino

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import edu.upb.tetris.common.Orientation
import edu.upb.tetris.common.Cell

@Composable
fun TetrominoO(
    modifier: Modifier = Modifier,
    color: Color = Color.Green,
    orientation: Orientation = Orientation.UP
) {
    Column() {
        for (i in 1..2) {
            Row() {
                for (j in 1..2) {
                    Cell(color = color)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TetrominoOPreview() {
    TetrominoO()
}