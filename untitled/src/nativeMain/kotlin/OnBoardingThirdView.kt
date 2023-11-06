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
fun OnBoardingThirdView() {
    var onboardingCompleted by remember { mutableStateOf(false) }

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
                text = "Welcome to Tinnitool",
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp),
                opacity = 0.0f
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularImageWithIcon(
                    imageResource = painterResource(id = R.drawable.oval),
                    iconResource = ImageVector.vectorResource(id = R.drawable.ic_stethoscope),
                    iconSize = 55.dp
                )

                Text(
                    text = "Questa è un'app pensata per essere utilizzata solo a scopo informativo. Non è destinato a sostituire la consulenza, la diagnosi o il trattamento medico professionale.",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
            .frame(width = 390, height = 350)

        Button(
            onClick = {
                onboardingCompleted = true
                // Esegui l'azione desiderata quando viene completato l'onboarding
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 16.dp)
                .background(color = Color.Yellow)
                .border(1.dp, Color.Gray, RoundedCornerShape(15.dp))
                .padding(top = 60.dp),
        ) {
            Text(
                text = "Calibrazione",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(16.dp),
            )
        }

        if (onboardingCompleted) {
            // Naviga alla vista successiva o esegui altre azioni post-onboarding
        }
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
