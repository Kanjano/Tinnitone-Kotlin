import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnBoardingFirstView() {
    var calibrationTextVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Benvenuto su TinniTone",
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularImageWithIcon(
                    imageResource = painterResource(id = R.drawable.oval),
                    iconResource = ImageVector.vectorResource(id = R.drawable.ic_ear_and_waveform),
                    iconSize = 55.dp
                )

                Text(
                    text = "Un'app per persone che soffrono di tinnutus",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(177.dp))
        }

        Text(
            text = "Calibration",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 16.dp)
                .background(color = Color.Yellow)
                .border(1.dp, Color.Gray, RoundedCornerShape(15.dp))
                .padding(top = 60.dp)
                .opacity(if (calibrationTextVisible) 1f else 0f)
        )
    }
}

@Composable
fun CircularImageWithIcon(
    imageResource: Painter,
    iconResource: ImageVector,
    iconSize: Dp
) {
    Box(
        modifier = Modifier
            .size(120.dp)
            .background(Color.Gray)
    ) {
        Image(
            painter = imageResource,
            contentDescription = null,
            modifier = Modifier.size(120.dp)
        )

        Icon(
            imageVector = iconResource,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(iconSize)
        )
    }
}
