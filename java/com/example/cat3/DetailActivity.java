package com.example.cat3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView detailDesc, detailTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailDesc = findViewById(R.id.detailDesc);
        detailTitle = findViewById(R.id.detailTitle);
        TextView detailDate = findViewById(R.id.detailDate); // Add a TextView for date

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailDesc.setText(bundle.getString("Desc"));
            detailTitle.setText(bundle.getString("Title"));
            detailDate.setText(bundle.getString("Date")); // Set the date value
        }
    }

}