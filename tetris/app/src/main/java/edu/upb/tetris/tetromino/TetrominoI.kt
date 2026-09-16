package edu.upb.tetris

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import edu.upb.tetris.common.Cell


@Composable
fun TetrominoI(
    modifier: Modifier = Modifier,
    color: Color = Color.Magenta,
    orientation: Orientation = Orientation.UP
) {
    when (orientation) {
        Orientation.UP, Orientation.DOWN -> TetrominoIUPDOWN(color = color)
        Orientation.RIGHT, Orientation.LEFT -> TetrominoIRIGHTLEFT(color = color)
    }
}

@Composable
fun TetrominoIUPDOWN(
    modifier: Modifier = Modifier,
    color: Color = Color.Magenta,
) {
    Column() {
        for (i in 1..4) {
            Row() {
                Cell(color = color)
            }
        }
    }
}

@Composable
fun TetrominoIRIGHTLEFT(
    modifier: Modifier = Modifier,
    color: Color = Color.Magenta,
) {
    Column() {
        Row() {
            for (i in 1..4) {
                Cell(color = color)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TetrominoIPreview() {
    TetrominoI()
}