package com.misw4302.pagoprompt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pay);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Busca el TextView por su ID
        TextView button2TextView = findViewById(R.id.button2TextView);

        // Agrega un OnClickListener al TextView
        button2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la actividad PostponeActivity
                Intent intent = new Intent(PayActivity.this, RedirectActivity.class);

                // Inicia la actividad
                startActivity(intent);
            }
        });
    }
}