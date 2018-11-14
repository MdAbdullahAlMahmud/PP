package com.musisa.preposition1100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    private int settime = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        LogoLancher logoLancher = new LogoLancher();
        logoLancher.start();

    }

    public class LogoLancher extends Thread{

        public void run(){

            try{

                sleep(1000 * 3);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            Intent home = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(home);
            SplashActivity.this.finish();
        }


    }

}
