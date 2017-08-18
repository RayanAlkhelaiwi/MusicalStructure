package me.rayanalkhelaiwi.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayingSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_song);

        //Declaration for the 3 ImageViews at the top in PlayingSongs page.
        ImageView songsListPS = (ImageView) findViewById(R.id.PlayingSong_songs_list);
        ImageView paymentPS = (ImageView) findViewById(R.id.PlayingSong_payment);
        ImageView artistListPS = (ImageView) findViewById(R.id.PlayingSong_artist_list);

        songsListPS.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songsListPS View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsListPS = new Intent(PlayingSong.this, SongsList.class);
                startActivity(songsListPS);
            }
        });

        paymentPS.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the paymentPS View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentPS = new Intent(PlayingSong.this, PaymentOption.class);
                startActivity(paymentPS);
            }
        });

        artistListPS.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artistListPS View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistListPS = new Intent(PlayingSong.this, ArtistList.class);
                startActivity(artistListPS);
            }
        });
    }
}
