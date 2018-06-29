package com.example.mayday.mypatatap;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playMusic(View view)
    {
        int id=view.getId();
        Log.i("ID","ID value is "+id);
        String nameID=view.getResources().getResourceEntryName(id);
        Log.i("nameID","name ID is "+nameID);

        int myMusic=getResources().getIdentifier(nameID,"raw","com.example.mayday.mypatatap");
        //difference between myMusic value and id value ???

        Log.i("myMusic","My Music value is "+myMusic);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
