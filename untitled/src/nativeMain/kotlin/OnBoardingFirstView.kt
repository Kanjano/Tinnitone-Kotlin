import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class OnBoardingFirstViewActivity : AppCompatActivity() {
    private lateinit var calibrationText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_first_view)

        // Find the Calibration TextView
        calibrationText = findViewById(R.id.calibrationText)

        // Set up any additional logic as needed
    }
}
