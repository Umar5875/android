package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1, t2, t3;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize Views
        b1 = findViewById(R.id.button);

        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);

        e1 = findViewById(R.id.editTextText2);
        e2 = findViewById(R.id.editTextTextPassword);

        // Login Button Click
        b1.setOnClickListener(v -> {

            String username = e1.getText().toString();
            String password = e2.getText().toString();

            if (username.equals("admin") && password.equals("1234")) {

                Toast.makeText(MainActivity.this,
                        "Successfully Login",
                        Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(MainActivity.this,
                        "Invalid Username or Password",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom);
            return insets;
        });
    }
}