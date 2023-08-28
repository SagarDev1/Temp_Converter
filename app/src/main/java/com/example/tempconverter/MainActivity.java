package com.example.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView4;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using my App!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int cel = Integer.parseInt(s);
                double fah = 1.8*cel + 32;
                double kel = cel + 273.15;

                textView.setText("• In Fahrenheit Scale : " + fah + " °F");
                textView4.setText("• In Kelvin Scale : " + kel +" K");



            }
        });


    }
}