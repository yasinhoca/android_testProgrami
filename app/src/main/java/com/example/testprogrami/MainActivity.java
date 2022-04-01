package com.example.testprogrami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    EditText soru;
    RadioButton r1,r2,r3,r4;
    Button cevapla,sonraki;
    TextView dogru,yanlis;
    Sorular sorular = new Sorular();
    ArrayList<Integer> sira = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
    int sayac = 0;
    int d,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soru = (EditText) findViewById(R.id.soru);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        r4 = (RadioButton) findViewById(R.id.r4);
        cevapla = (Button) findViewById(R.id.cevapla);
        sonraki = (Button) findViewById(R.id.sonraki);
        dogru = (TextView) findViewById(R.id.dogru);
        yanlis = (TextView) findViewById(R.id.yanlis);

        Collections.shuffle(sira);
        yukle();

        sonraki.setEnabled(false);
        d=y=0;

        sonraki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayac++;
                if(sayac<5) yukle();
                cevapla.setEnabled(true);
            }
        });



        cevapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){
                    if(r1.getText().equals(sorular.cev.get(sira.get(sayac)))){
                        d++;
                        dogru.setText(d+" DOĞRU");
                    }else{
                        y++;
                        yanlis.setText(y+ " YANLIŞ");
                    }
                }

                if(r2.isChecked()){
                    if(r2.getText().equals(sorular.cev.get(sira.get(sayac)))){
                        d++;
                        dogru.setText(d+" DOĞRU");
                    }else{
                        y++;
                        yanlis.setText(y+ " YANLIŞ");
                    }
                }

                if(r3.isChecked()){
                    if(r3.getText().equals(sorular.cev.get(sira.get(sayac)))){
                        d++;
                        dogru.setText(d+" DOĞRU");
                    }else{
                        y++;
                        yanlis.setText(y+ " YANLIŞ");
                    }
                }

                if(r4.isChecked()){
                    if(r4.getText().equals(sorular.cev.get(sira.get(sayac)))){
                        d++;
                        dogru.setText(d+" DOĞRU");
                    }else{
                        y++;
                        yanlis.setText(y+ " YANLIŞ");
                    }
                }
                cevapla.setEnabled(false);
                sonraki.setEnabled(true);
            }
        });

    }

    public void yukle(){
        soru.setText(sorular.s.get(sira.get(sayac)));
        Collections.shuffle(sorular.sec[sira.get(sayac)]);
        r1.setText(sorular.sec[sira.get(sayac)].get(0));
        r2.setText(sorular.sec[sira.get(sayac)].get(1));
        r3.setText(sorular.sec[sira.get(sayac)].get(2));
        r4.setText(sorular.sec[sira.get(sayac)].get(3));

        sonraki.setEnabled(false);
    }
}