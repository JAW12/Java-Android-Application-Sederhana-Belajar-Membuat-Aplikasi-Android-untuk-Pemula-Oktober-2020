package com.example.proyekaplikasisederhana;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    String nama;
    String deskripsi;
    String lokasi;
    String alamat;
    String telp;
    String map;
    String harga;
    String rating;

    public Makanan() {
    }

    protected Makanan(Parcel in) {
        nama = in.readString();
        deskripsi = in.readString();
        lokasi = in.readString();
        alamat = in.readString();
        telp = in.readString();
        map = in.readString();
        harga = in.readString();
        rating = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    int photo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(deskripsi);
        parcel.writeString(lokasi);
        parcel.writeString(alamat);
        parcel.writeString(telp);
        parcel.writeString(map);
        parcel.writeString(harga);
        parcel.writeString(rating);
        parcel.writeInt(photo);
    }

    @Override
    public String toString() {
        return nama + "(⭐" + rating + ")\n📌 " +
                lokasi + "\n📍 " +
                alamat + "\n\n" +
                deskripsi + "\n\n" +
                "💵 " + harga + "\n\n" +
                "📞 Info lebih lanjut bisa menghubungi " + telp +"\n" +
                "✏ Telah direview oleh foodMantab";
    }
}
