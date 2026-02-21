package com.example.buttonstoast_bscs2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.buttonstoast_bscs2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button Invisiblebtn, Pinkbtn;

        Invisiblebtn = findViewById(R.id.btnInvisibleMan);
        Pinkbtn = findViewById(R.id.btnPinkPanther);


        Invisiblebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Invisiblebtn.setVisibility(View.GONE);
            }
        });


        Pinkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "to do, to do, to do, to do...",
                        Toast.LENGTH_SHORT
                ).show();

                Invisiblebtn.setVisibility(View.VISIBLE);
            }
        });
    }
}