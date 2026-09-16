package edu.upb.tetris.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.upb.tetris.common.Cell

@Composable
fun TetrisBoard(
    modifier: Modifier = Modifier,
    board: Array<Array<Color>>
) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .padding(5.dp)
    ) {
        board.forEach { row ->
            Row() {
                row.forEach { color ->
                    Cell(modifier = modifier, color = color)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TetrisBoardPreview() {
    TetrisBoard(board = Array(24) { Array(12) { Color.DarkGray } })
}