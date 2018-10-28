package com.pranaypathole.learnmorse;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView morseList;
    ArrayList<String> charList;
    ArrayAdapter<String> mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morseList = findViewById(R.id.morseList);
        charList = new ArrayList<String>();
        charList.add("A");
        charList.add("B");
        charList.add("C");
        charList.add("D");
        charList.add("E");
        charList.add("F");
        charList.add("G");
        charList.add("H");
        charList.add("I");
        charList.add("J");
        charList.add("K");
        charList.add("L");
        charList.add("M");
        charList.add("N");
        charList.add("O");
        charList.add("P");
        charList.add("Q");
        charList.add("R");
        charList.add("S");
        charList.add("T");
        charList.add("U");
        charList.add("V");
        charList.add("W");
        charList.add("X");
        charList.add("Y");
        charList.add("Z");

        mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, charList);

        morseList.setAdapter(mArrayAdapter);

        morseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsea);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing A...", Toast.LENGTH_SHORT).show();
                }

                if(i == 1){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseb);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing B...", Toast.LENGTH_SHORT).show();
                }

                if(i == 2){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsec);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing C...", Toast.LENGTH_SHORT).show();
                }

                if(i == 3){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsed);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing D...", Toast.LENGTH_SHORT).show();
                }

                if(i == 4){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsee);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing E...", Toast.LENGTH_SHORT).show();
                }

                if(i == 5){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsef);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing F...", Toast.LENGTH_SHORT).show();
                }

                if(i == 6){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseg);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing G...", Toast.LENGTH_SHORT).show();
                }

                if(i == 7){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseh);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing H...", Toast.LENGTH_SHORT).show();
                }

                if(i == 8){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsei);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing I...", Toast.LENGTH_SHORT).show();
                }

                if(i == 9){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsj);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing J...", Toast.LENGTH_SHORT).show();
                }

                if(i == 10){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsek);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing K...", Toast.LENGTH_SHORT).show();
                }

                if(i == 11){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsel);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing L...", Toast.LENGTH_SHORT).show();
                }

                if(i == 12){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsem);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing M...", Toast.LENGTH_SHORT).show();
                }

                if(i == 13){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsen);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing N...", Toast.LENGTH_SHORT).show();
                }

                if(i == 14){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseo);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing O...", Toast.LENGTH_SHORT).show();
                }

                if(i == 15){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsep);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing P...", Toast.LENGTH_SHORT).show();
                }

                if(i == 16){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseq);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing Q...", Toast.LENGTH_SHORT).show();
                }

                if(i == 17){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morser);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing R...", Toast.LENGTH_SHORT).show();
                }

                if(i == 18){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morses);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing S...", Toast.LENGTH_SHORT).show();
                }

                if(i == 19){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morset);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing T...", Toast.LENGTH_SHORT).show();
                }

                if(i == 20){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morseu);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing U...", Toast.LENGTH_SHORT).show();
                }

                if(i == 21){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsev);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing V...", Toast.LENGTH_SHORT).show();
                }

                if(i == 22){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsew);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing V...", Toast.LENGTH_SHORT).show();
                }

                if(i == 23){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsex);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing X...", Toast.LENGTH_SHORT).show();
                }

                if(i == 24){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsey);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing Y...", Toast.LENGTH_SHORT).show();
                }

                if(i == 25){
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.morsez);
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing Z...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
