package org.xhin.intentdays3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickpolis(View view) {
    }

    public void clickRs(View view) {
//        ketika logo rs diklik
        Intent intentHospital = new Intent(this, Hospital.class);
        startActivity(intentHospital);
    }


}