package ru.samsung.itschool.book;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View view) {
        TextView result = findViewById(R.id.res);
        EditText textA = findViewById(R.id.a);
        EditText textB = findViewById(R.id.b);
        EditText textC = findViewById(R.id.c);
        double a = Double.parseDouble(textA.getText().toString());
        double b = Double.parseDouble(textB.getText().toString());
        double c = Double.parseDouble(textC.getText().toString());
        double x1;
        double x2;
        double x;
        double d = (b * b) - (4 * a * c);
        if (d > 0 && a != 0) {
            x1 = ((-b + Math.sqrt(d)) / 2 * a);
            x2 = ((-b - Math.sqrt(d)) / 2 * a);
            result.setText(String.valueOf(x1) + " " + String.valueOf(x2));

        } else if (d == 0) {
            x = -b / 2 * a;
            result.setText(String.valueOf(x));
        } else if (d < 0) {
            result.setText("none");
        } else if (a == 0 && b == 0 && c == 0) {
            result.setText("any");

        } else {
            x = -c / b;
            result.setText(String.valueOf(x));
        }

    }
}