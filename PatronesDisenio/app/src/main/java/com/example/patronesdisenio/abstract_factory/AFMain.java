package com.example.patronesdisenio.abstract_factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.patronesdisenio.R;
import com.example.patronesdisenio.abstract_factory.factory.MacOSFactory;
import com.example.patronesdisenio.abstract_factory.factory.WindowsFactory;
import com.example.patronesdisenio.abstract_factory.interfaces.GUIFactory;

public class AFMain extends AppCompatActivity {
    private Application application;
    private GUIFactory factory;

    private Button btnMac, btnWindows;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afmain);

        btnMac = findViewById(R.id.btnMac);
        btnWindows = findViewById(R.id.btnWindows);
        tvResult = findViewById(R.id.tvResult);

        btnMac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factory = new MacOSFactory();
                application = new Application(factory);

                tvResult.setText(application.paint());
            }
        });

        btnWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factory = new WindowsFactory();
                application = new Application(factory);

                tvResult.setText(application.paint());
            }
        });
    }
}
