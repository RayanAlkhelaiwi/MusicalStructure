package me.rayanalkhelaiwi.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PaymentOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_option);

        //Declaration for the 3 ImageViews at the top in Payment page.
        ImageView songsListP = (ImageView) findViewById(R.id.Payment_ab_songs_list);
        ImageView playingP = (ImageView) findViewById(R.id.Payment_ab_playing);
        ImageView artistListP = (ImageView) findViewById(R.id.Payment_ab_artist_list);

        songsListP.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songsListP View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsListP = new Intent(PaymentOption.this, SongsList.class);
                startActivity(songsListP);
            }
        });

        playingP.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playingP View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingP = new Intent(PaymentOption.this, PlayingSong.class);
                startActivity(playingP);
            }
        });

        artistListP.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artistListP View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistListP = new Intent(PaymentOption.this, ArtistList.class);
                startActivity(artistListP);
            }
        });
    }
}
