package edu.upb.tetris.control

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import edu.upb.tetris.R

@Composable
fun ControlButton(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    size: Dp = 40.dp,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFB300))
    ) {
        if (icon != null) {
            Icon (
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(size * 0.6f),
                tint = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ControlButtonPreview() {
    ControlButton(
        size = 90.dp,
        onClick = {},
        icon = ImageVector.vectorResource(id = R.drawable.outline_keyboard_arrow_down_24)
    )
}
