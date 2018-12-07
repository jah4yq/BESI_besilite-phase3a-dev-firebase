package com.uva.inertia.besilite;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class RatingActivity extends Activity {

    int r1,r2,r3,r4;
    TextView rv1, rv2, rv3, rv4;
    String[] answer = {"0","1","2","3","4","5","6","7","8","9","10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rating_activity);



        r1=1100;
        r2=1100;
        r3=1100;
        r4=1100;

        rv1 = findViewById(R.id.rateview1);
        rv1.setText(answer[r1%11]);
        rv2 = findViewById(R.id.rateview2);
        rv2.setText(answer[r2%11]);
        rv3 = findViewById(R.id.rateview3);
        rv3.setText(answer[r3%11]);
        rv4 = findViewById(R.id.rateview4);
        rv4.setText(answer[r4%11]);


    }


    public void incriment(View v){
        if (v.getId() == R.id.plusbutton1){
            r1++;
            rv1.setText(answer[r1%11]);
        }
        if (v.getId() == R.id.plusbutton2){
            r2++;
            rv2.setText(answer[r2%11]);

        }
        if (v.getId() == R.id.plusbutton3){
            r3++;
            rv3.setText(answer[r3%11]);

        }
        if (v.getId() == R.id.plusbutton4){
            r4++;
            rv4.setText(answer[r4%11]);
        }
    }

    public void decriment(View v){
        if (v.getId() == R.id.minusbutton1){
            r1--;
            rv1.setText(answer[r1%11]);
        }
        if (v.getId() == R.id.minusbutton2){
            r2--;
            rv2.setText(answer[r2%11]);

        }
        if (v.getId() == R.id.minusbutton3){
            r3--;
            rv3.setText(answer[r3%11]);

        }
        if (v.getId() == R.id.minusbutton4){
            r4--;
            rv4.setText(answer[r4%11]);
        }
    }

    public void backClick(View v){
        Intent intent = new Intent(this.getApplicationContext(), Home.class);
        startActivity(intent);

    }

    public void submitClick(View v){
        Intent intent = new Intent(this.getApplicationContext(), Home.class);
        startActivity(intent);

    }


}
