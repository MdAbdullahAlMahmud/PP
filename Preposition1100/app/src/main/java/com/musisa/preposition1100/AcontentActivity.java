package com.musisa.preposition1100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.musisa.preposition1100.Adapter.CustomAdapter;

public class AcontentActivity extends AppCompatActivity {
    private AdView mAdView;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acontent);
        lv=findViewById(R.id.aitem);
        int a=getIntent().getIntExtra("aitem",0);
        if(a==0){
            String[] value= getResources().getStringArray(R.array.lista);
            String[] value1= getResources().getStringArray(R.array.meaninga);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }if(a==1){
            String[] value= getResources().getStringArray(R.array.liste);
            String[] value1= getResources().getStringArray(R.array.meaninge);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }if(a==2){
            String[] value= getResources().getStringArray(R.array.listi);
            String[] value1= getResources().getStringArray(R.array.meaningi);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }if(a==3){
            String[] value= getResources().getStringArray(R.array.listm);
            String[] value1= getResources().getStringArray(R.array.meaningm);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }if(a==4){
            String[] value= getResources().getStringArray(R.array.listq);
            String[] value1= getResources().getStringArray(R.array.meaningq);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }if(a==5){
            String[] value= getResources().getStringArray(R.array.listu);
            String[] value1= getResources().getStringArray(R.array.meaningu);
            CustomAdapter aactivity = new CustomAdapter(this,value,value1);
            lv.setAdapter(aactivity);
        }

        //banner ad

        mAdView= findViewById(R.id.adView);
        AdRequest adRequest= new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }




}












