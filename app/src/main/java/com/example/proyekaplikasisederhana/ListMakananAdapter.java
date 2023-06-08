package com.example.proyekaplikasisederhana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListViewHolder> {
    private ArrayList<Makanan> listMakanan;
    private Context context;

    public ListMakananAdapter(ArrayList<Makanan> list, Context context){
        this.listMakanan = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListMakananAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_makanan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListMakananAdapter.ListViewHolder holder, int position) {
        final Makanan makanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(500, 500))
                .into(holder.imgMakanan);
        holder.textHarga.setText(makanan.getHarga());
        holder.textLokasi.setText(makanan.getLokasi());
        holder.textRating.setText(makanan.getRating());
        holder.textNama.setText(makanan.getNama());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Detail.class);
                i.putExtra("makanan", makanan);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMakanan;
        TextView textNama, textRating, textLokasi, textHarga;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMakanan = itemView.findViewById(R.id.imageMakanan);
            textNama = itemView.findViewById(R.id.textNama);
            textRating = itemView.findViewById(R.id.textRating);
            textLokasi = itemView.findViewById(R.id.textLokasi);
            textHarga = itemView.findViewById(R.id.textHarga);
        }
    }
}
