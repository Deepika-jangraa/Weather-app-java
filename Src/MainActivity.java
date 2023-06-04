import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCity;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCity = findViewById(R.id.editTextCity);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonSearch = findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city = editTextCity.getText().toString().trim();
                if (!TextUtils.isEmpty(city)) {
                    // Call a method to fetch weather data using the city name
                    fetchWeatherData(city);
                }
            }
        });
    }

    private void fetchWeatherData(String city) {
        // TODO: Implement your code to fetch weather data from the API and display it in the textViewResult
        // You need to make network requests to the weather API and parse the JSON response to extract weather information
        // Display the weather information in the textViewResult
    }
}
