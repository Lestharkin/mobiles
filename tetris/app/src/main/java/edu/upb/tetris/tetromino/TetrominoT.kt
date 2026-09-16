package edu.upb.tetris

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import edu.upb.tetris.common.Cell

@Composable
fun TetrominoT(
    modifier: Modifier = Modifier,
    color: Color = Color.Blue,
    orientation: Orientation = Orientation.UP
) {
    Column() {
        for (i in 1..2) {
            Row() {
                for (j in 1..3) {
                    if (i == 2) {
                        if (j == 2) {
                            Cell(color = color)
                        } else {
                            Cell(
                                color = Color.Transparent
                            )
                        }
                    } else {
                        Cell(color = color)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TetrominoTPreview() {
    TetrominoT()
}