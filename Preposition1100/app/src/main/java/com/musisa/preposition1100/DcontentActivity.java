package com.musisa.preposition1100;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.musisa.preposition1100.Adapter.CustomAdapter;

public class DcontentActivity extends AppCompatActivity {

    ListView listView;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcontent);
        listView= findViewById(R.id.ditem);
        int dcolom=getIntent().getIntExtra("ditem",0);
        if(dcolom==0){
            String[] value = getResources().getStringArray(R.array.listd);
            String[] value1 = getResources().getStringArray(R.array.meaningd);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }
        if(dcolom==1){
            String[] value = getResources().getStringArray(R.array.listh);
            String[] value1 = getResources().getStringArray(R.array.meaningh);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }
        if(dcolom==2){
            String[] value = getResources().getStringArray(R.array.listl);
            String[] value1 = getResources().getStringArray(R.array.meaningl);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }
        if(dcolom==3){
            String[] value = getResources().getStringArray(R.array.listp);
            String[] value1 = getResources().getStringArray(R.array.meaningp);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }
        if(dcolom==4){
            String[] value = getResources().getStringArray(R.array.listt);
            String[] value1 = getResources().getStringArray(R.array.meaningt);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }
        if(dcolom==5){
            String[] value = getResources().getStringArray(R.array.listx);
            String[] value1 = getResources().getStringArray(R.array.meaningx);
            CustomAdapter dactivity = new CustomAdapter(this, value, value1);
            listView.setAdapter(dactivity);
        }

        //banner_ad
        mAdView = findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        //interestitial_ad

        mInterstitialAd= new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interestial_ad));
        AdRequest request= new AdRequest.Builder().build();
        mInterstitialAd.loadAd(request);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }

            }
        },10000);




    }
}

