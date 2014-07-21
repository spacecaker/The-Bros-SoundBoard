package com.robin.thebrossoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BroActivity extends Activity {
	
	Button watsdeze;
	Button boterham;
	Button stenen;
	Button mkay;
	
	
	private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bro);
        
        watsdeze = (Button)this.findViewById(R.id.button1);
        watsdeze.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        	   stopPlaying();
               mp = MediaPlayer.create(getBaseContext(), R.raw.watsdeze);
               mp.setOnCompletionListener(new OnCompletionListener() {
                   public void onCompletion(MediaPlayer mp) {
                       mp.reset();
                       mp.release();
                       mp=null;
                   }
               });
               mp.start();
           }
       });		
     
       
        boterham = (Button)this.findViewById(R.id.button2);
        boterham.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        	   stopPlaying();
               mp = MediaPlayer.create(getBaseContext(), R.raw.boterham);
               mp.setOnCompletionListener(new OnCompletionListener() {
                   public void onCompletion(MediaPlayer mp) {
                       mp.reset();
                       mp.release();
                       mp=null;
                   }
               });
               mp.start();
           }
       });		        
       
        
        stenen = (Button)this.findViewById(R.id.Button01);
        stenen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        	   stopPlaying();
               mp = MediaPlayer.create(getBaseContext(), R.raw.stenen);
               mp.setOnCompletionListener(new OnCompletionListener() {
                   public void onCompletion(MediaPlayer mp) {
                       mp.reset();
                       mp.release();
                       mp=null;
                   }
               });
               mp.start();
           }
       });	
        
        
        mkay = (Button)this.findViewById(R.id.Button01);
        mkay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        	   stopPlaying();
               mp = MediaPlayer.create(getBaseContext(), R.raw.mkay);
               mp.setOnCompletionListener(new OnCompletionListener() {
                   public void onCompletion(MediaPlayer mp) {
                       mp.reset();
                       mp.release();
                       mp=null;
                   }
               });
               mp.start();
           }
       });	        
    }    
    
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
       }
    }    
}
