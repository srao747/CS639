package com.example.metricconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText metersInput = findViewById(R.id.metersInput);
        Button convertButton = findViewById(R.id.convertButton);
        TextView millimetersOutput = findViewById(R.id.millimetersOutput);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = metersInput.getText().toString();
                if (!input.isEmpty()) {
                    double meters = Double.parseDouble(input);
                    double millimeters = meters * 1000; // Conversion
                    millimetersOutput.setText(millimeters + " millimeters");
                } else {
                    millimetersOutput.setText("Please enter a valid value");
                }
            }
        });
    }
}
