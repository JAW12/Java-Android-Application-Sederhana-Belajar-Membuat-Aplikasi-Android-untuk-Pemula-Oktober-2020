package com.example.proyekaplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    Makanan makanan = new Makanan();
    TextView textNama, textRating, textDeskripsi, textHarga, textLokasi, textAlamat;
    ImageView imgMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        init();
        show();
    }

    private void init(){
        textNama = findViewById(R.id.textNama);
        textRating = findViewById(R.id.textRating);
        textDeskripsi = findViewById(R.id.textDeskripsi);
        textHarga = findViewById(R.id.textHarga);
        textLokasi = findViewById(R.id.textLokasi);
        textAlamat = findViewById(R.id.textAlamat);
        imgMakanan = findViewById(R.id.imageView);

        if(getIntent().hasExtra("makanan")){
            makanan = getIntent().getParcelableExtra("makanan");
        }
    }

    private void show(){
        textNama.setText(makanan.getNama());
        textRating.setText(makanan.getRating());
        textDeskripsi.setText(makanan.getDeskripsi());
        textDeskripsi.setMovementMethod(new ScrollingMovementMethod());
        textHarga.setText(makanan.getHarga());
        textLokasi.setText(makanan.getLokasi());
        textAlamat.setText(makanan.getAlamat());
        Glide.with(this)
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(20, 20))
                .into(imgMakanan);

        getSupportActionBar().setTitle(makanan.getNama());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void telepon(View view){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + makanan.getTelp()));
        startActivity(i);
    }

    public void map(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.codes/" + makanan.getMap()));
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_share, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.option_share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, makanan.toString());
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;
            default:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}