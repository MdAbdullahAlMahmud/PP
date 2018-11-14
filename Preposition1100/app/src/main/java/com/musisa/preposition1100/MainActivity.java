package com.musisa.preposition1100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lv,lv2,lv3,lv4;
    TextView tv;
    ArrayAdapter<String> munna,munna2,munna3,munna4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        lv2= findViewById(R.id.lv2);
        lv3= findViewById(R.id.lv3);
        lv4= findViewById(R.id.lv4);
        tv = findViewById(R.id.tv);


        String[] colomone= getResources().getStringArray(R.array.firstcolum);
        String[] colomtwo= getResources().getStringArray(R.array.secondcolum);
        String[] colomthree= getResources().getStringArray(R.array.thirdcolum);
        String[] colomfour= getResources().getStringArray(R.array.forthcolum);

        munna = new ArrayAdapter<>(this,R.layout.firstsample,R.id.tv,colomone);
        munna2 = new ArrayAdapter<>(this,R.layout.firstsample,R.id.tv,colomtwo);
        munna3 = new ArrayAdapter<>(this,R.layout.firstsample,R.id.tv,colomthree);
        munna4 = new ArrayAdapter<>(this,R.layout.firstsample,R.id.tv,colomfour);
        lv.setAdapter(munna);
        lv2.setAdapter(munna2);
        lv3.setAdapter(munna3);
        lv4.setAdapter(munna4);




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int aposition, long id) {
                startActivity(new Intent(MainActivity.this,AcontentActivity.class).putExtra("aitem",aposition));


//
            }
        });

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this,BcontentActivity.class).putExtra("bitem",position));
            }
        });



        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                startActivity(new Intent(MainActivity.this,ContentActivity.class).putExtra("Munna3",position));
            }

        });
        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this,DcontentActivity.class).putExtra("ditem",position));
            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        MenuItem menuItem= menu.findItem(R.id.searchButton);
        MenuItem profile= menu.findItem(R.id.developer);
        SearchView searchView= (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                munna.getFilter().filter(newText);
                munna2.getFilter().filter(newText);
                munna3.getFilter().filter(newText);
                munna4.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.developer){
            Intent profile = new Intent(MainActivity.this,DeveloperActivity.class);
            startActivity(profile);
            return false;


        }
        return super.onOptionsItemSelected(item);
    }
}
