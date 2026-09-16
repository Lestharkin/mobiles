package edu.upb.tetris.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.upb.tetris.control.GameControl

@Composable
fun TetrisGame(modifier: Modifier = Modifier) {
    val COLUMN = 12
    val ROW = 24

    val board = Array(ROW) { Array(COLUMN) { Color.DarkGray } }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(10.dp),
        Arrangement.Center
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TetrisBoard(board = board)
        }
        Row (
        ) {
            GameControl(
                moveLeft = {},
                moveRight = {},
                moveDown = {},
                rotate = {},
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TetrisGamePreview() {
    TetrisGame()
}