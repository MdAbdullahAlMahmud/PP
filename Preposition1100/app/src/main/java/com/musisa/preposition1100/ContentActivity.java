package com.musisa.preposition1100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.musisa.preposition1100.Adapter.CustomAdapter;

public class ContentActivity extends AppCompatActivity {

    private AdView mAdView;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        listView= findViewById(R.id.conlistView);


        int ccoloum=  getIntent().getIntExtra("Munna3",0);
        if(ccoloum==0){
            String[] value = getResources().getStringArray(R.array.listc);
            String[] value1 = getResources().getStringArray(R.array.meaningc);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==1){
            String[] value = getResources().getStringArray(R.array.listg);
            String[] value1 = getResources().getStringArray(R.array.meaningg);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==2){
            String[] value = getResources().getStringArray(R.array.listk);
            String[] value1 = getResources().getStringArray(R.array.meaningk);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==3){
            String[] value = getResources().getStringArray(R.array.listo);
            String[] value1 = getResources().getStringArray(R.array.meaningo);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==4){
            String[] value = getResources().getStringArray(R.array.lists);
            String[] value1 = getResources().getStringArray(R.array.meanings);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==5){
            String[] value = getResources().getStringArray(R.array.listw);
            String[] value1 = getResources().getStringArray(R.array.meaningw);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        if(ccoloum==6){
            String[] value = getResources().getStringArray(R.array.listz);
            String[] value1 = getResources().getStringArray(R.array.meaningz);
            CustomAdapter cactivity = new CustomAdapter(this,value,value1);
            listView.setAdapter(cactivity);
        }
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}
