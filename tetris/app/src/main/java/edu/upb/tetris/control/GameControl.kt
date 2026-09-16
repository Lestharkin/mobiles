package edu.upb.tetris.control

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.upb.tetris.R

@Composable
fun GameControl(
    moveLeft: () -> Unit,
    moveRight: () -> Unit,
    moveDown: () -> Unit,
    rotate: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                ControlButton(
                    icon = ImageVector.vectorResource(R.drawable.outline_keyboard_arrow_left_24),
                    onClick = moveLeft
                )
                ControlButton(
                    icon = ImageVector.vectorResource(R.drawable.outline_keyboard_arrow_right_24),
                    onClick = moveRight
                )
            }
            ControlButton(
                icon = ImageVector.vectorResource(R.drawable.outline_keyboard_arrow_down_24),
                onClick = moveDown
            )
        }
        ControlButton(
            size = 90.dp,
            icon = ImageVector.vectorResource(R.drawable.outline_refresh_24),
            onClick = rotate
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TetrisButtonsPreview() {
    GameControl(
        moveLeft = {},
        moveRight = {},
        moveDown = {},
        rotate = {},
    )
}