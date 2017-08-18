package me.rayanalkhelaiwi.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SongsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Sets the window of the SongsList to differentiate from the app name in the AndroidManifest.
        setTitle("Songs List");

        //Declaration for the 3 ImageViews at the top in SongsList page.
        ImageView playingSL = (ImageView) findViewById(R.id.SongsList_playing);
        ImageView paymentSL = (ImageView) findViewById(R.id.SongsList_payment);
        ImageView artistListSL = (ImageView) findViewById(R.id.SongsList_artist_list);

        playingSL.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playingSL View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingSL = new Intent(SongsList.this, PlayingSong.class);
                startActivity(playingSL);
            }
        });

        paymentSL.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the paymentSL View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentSL = new Intent(SongsList.this, PaymentOption.class);
                startActivity(paymentSL);
            }
        });

        artistListSL.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artistListSL View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistListSL = new Intent(SongsList.this, ArtistList.class);
                startActivity(artistListSL);
            }
        });
    }
}
