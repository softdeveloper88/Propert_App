package com.example.propert_app.activity.add_property;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.propert_app.R;

public class AddPropertyTwoActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int say = 0;
    TextView text_view, txt_liveScore;
    Button btn_next_step;

    TextView bathroomDecrement_txt, bathroomInDecValue_txt, bathroomIncrement_txt, bedroomDecrement_txt,
            bedroomIncrement_txt, bedroomInDecValue_txt, floorDecrement_txt, floorInDecValue_txt, floorIncrement_txt;

    SwitchCompat switchNegotiableRS;
    EditText edt_min_rs, edt_max_rs;


    int bathroom = 0;
    int bedroom = 0;
    int floor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property_two);
        init();

        listeners();
        bathroomInDec();
        bedroomInDec();
        floorFoomInDec();

       /* progressBar.setMax(100);
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                say++;
                progressBar.setProgress(say);
                text_view.setText(say+"");
            }
        });*/

    }

    private void listeners() {


        switchNegotiableRS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switchNegotiableRS.isChecked()) {
                    edt_max_rs.setEnabled(false);
                    edt_min_rs.setEnabled(false);
                } else if (!switchNegotiableRS.isChecked()) {
                    edt_max_rs.setEnabled(true);
                    edt_min_rs.setEnabled(true);
                }

            }
        });


        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_maxRs = edt_max_rs.getText().toString().trim();
                String str_minRs = edt_min_rs.getText().toString().trim();


                if (str_minRs.isEmpty()) {
                    edt_min_rs.setError("Empty Field");
                    return;
                } else if (str_maxRs.isEmpty()) {
                    edt_max_rs.setError("Empty Field");
                    return;
                } else if (Integer.parseInt(edt_min_rs.getText().toString().trim()) < 1000) {
                    Toast.makeText(AddPropertyTwoActivity.this, "Must be greater than 1k", Toast.LENGTH_SHORT).show();
                    return;
                } else {

                    goTo(str_maxRs, str_minRs);

                }
            }
        });


    }

    private void bathroomInDec() {
        bathroomDecrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bathroom<=0){
                    bathroom=0;
                    bathroomInDecValue_txt.setText(String.valueOf(bathroom));


                }else {
                    bathroom--;
                    bathroomInDecValue_txt.setText(String.valueOf(bathroom));
                }
            }
        });
        bathroomIncrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bathroom++;
                bathroomInDecValue_txt.setText(String.valueOf(bathroom));

            }
        });

    }
    private void bedroomInDec() {
        bedroomDecrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bedroom<=0){
                    bedroom=0;
                    bedroomInDecValue_txt.setText(String.valueOf(bedroom));


                }else {
                    bedroom--;
                    bedroomInDecValue_txt.setText(String.valueOf(bedroom));
                }
            }
        });
        bedroomIncrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bedroom++;
                bedroomInDecValue_txt.setText(String.valueOf(bedroom));

            }
        });

    }
    private void floorFoomInDec() {
        floorDecrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (floor<=0){
                    floor=0;
                    floorInDecValue_txt.setText(String.valueOf(floor));


                }else {
                    floor--;
                    floorInDecValue_txt.setText(String.valueOf(floor));
                }
            }
        });
        floorIncrement_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                floor++;
                floorInDecValue_txt.setText(String.valueOf(floor));

            }
        });

    }

    private void goTo(String ste_maxRs, String ste_minRs) {

        startActivity(new Intent(AddPropertyTwoActivity.this, AddPropertyThreeActivity.class));

    }


    private void init() {
        edt_min_rs = findViewById(R.id.et_min_rs);
        edt_max_rs = findViewById(R.id.et_max_rs);
        switchNegotiableRS = findViewById(R.id.switchNegotiableRS);
        bathroomDecrement_txt = findViewById(R.id.bathroomDecrement);
        bathroomInDecValue_txt = findViewById(R.id.bathroomIncrementValue);
        bathroomIncrement_txt = findViewById(R.id.bathroomIncrement);

        bedroomDecrement_txt = findViewById(R.id.bedroomDecrement);
        bedroomIncrement_txt = findViewById(R.id.bedroomIncrement);
        bedroomInDecValue_txt = findViewById(R.id.bedroomIncrementValue);

        floorDecrement_txt = findViewById(R.id.floorDecrement);
        floorInDecValue_txt = findViewById(R.id.floorDecrementValue);
        floorIncrement_txt = findViewById(R.id.floorIncrement);

        progressBar = findViewById(R.id.progress2);
        btn_next_step = findViewById(R.id.btn_next_stepTwo);

        text_view = findViewById(R.id.text_view);
        txt_liveScore = findViewById(R.id.txt_liveScore);
    }
}