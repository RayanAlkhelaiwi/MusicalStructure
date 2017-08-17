package me.rayanalkhelaiwi.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ArtistList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        ImageView songsListAL = (ImageView) findViewById(R.id.songsListAL);
        ImageView paymentAL = (ImageView) findViewById(R.id.paymentAL);
        ImageView playingAL = (ImageView) findViewById(R.id.playingAL);

        songsListAL.setOnClickListener (new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsListAL = new Intent(ArtistList.this, SongsList.class);
                startActivity(songsListAL);
            }
        });

        paymentAL.setOnClickListener (new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentAL = new Intent(ArtistList.this, PaymentOption.class);
                startActivity(paymentAL);
            }
        });

        playingAL.setOnClickListener (new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingAL = new Intent(ArtistList.this, PlayingSong.class);
                startActivity(playingAL);
            }
        });
    }
}
