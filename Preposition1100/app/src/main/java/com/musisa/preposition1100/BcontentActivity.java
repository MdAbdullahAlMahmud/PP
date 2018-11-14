package com.musisa.preposition1100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.musisa.preposition1100.Adapter.CustomAdapter;

public class BcontentActivity extends AppCompatActivity {

    private AdView mAdView;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcontent);
        listView=findViewById(R.id.bitem);
        int bcolom= getIntent().getIntExtra("bitem",0);

        if(bcolom==0) {
            String[] value = getResources().getStringArray(R.array.listb);
            String[] value1 = getResources().getStringArray(R.array.meaningb);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==1) {
            String[] value = getResources().getStringArray(R.array.listf);
            String[] value1 = getResources().getStringArray(R.array.meaningf);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==2) {
            String[] value = getResources().getStringArray(R.array.listj);
            String[] value1 = getResources().getStringArray(R.array.meaningj);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==3) {
            String[] value = getResources().getStringArray(R.array.listn);
            String[] value1 = getResources().getStringArray(R.array.meaningn);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==4) {
            String[] value = getResources().getStringArray(R.array.listr);
            String[] value1 = getResources().getStringArray(R.array.meaningr);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==5) {
            String[] value = getResources().getStringArray(R.array.listv);
            String[] value1 = getResources().getStringArray(R.array.meaningv);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        if(bcolom==6) {
            String[] value = getResources().getStringArray(R.array.listy);
            String[] value1 = getResources().getStringArray(R.array.meaningy);
            CustomAdapter cactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(cactivity);
        }
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




    }


}

