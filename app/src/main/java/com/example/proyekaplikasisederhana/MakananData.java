package com.example.proyekaplikasisederhana;

import java.util.ArrayList;

public class MakananData {
    private static String[] arrNama = {
            "Nasi Jagung Wader + Lalapan & Sambel",
            "Fish n Rice Cabai Hijau ",
            "Beef Wagyu Saikoro",
            "Lontong Kupang",
            "Nasi Bebek Goreng",
            "Mie Ayam Spesial",
            "Sop Kaki Kambing",
            "Pecel Belut",
            "Nasi Kuning Lauk Telor + Tongkol",
            "Rujak Cingur"
    };

    private static String[] arrDeskripsi = {
            "Ini salah satu wader terenak dan paling terkenal di Surabaya! Wadernya bener bener digoreng krispi sampe super krius, dimakan bareng lalapan + sambel + NASI JAGUNG.",
            "Dengan menu andalan Fish n Chips, tapi dengan sentuhan taste khas Nusantara, dengan pilihan rasa sambal ijo. Sambal ijonya mild, ada manis manisnya, unik! Disajikan dengan french fries + kangkung crispy.",
            "Jadi ini snack yang lagi ngehits di Thailand, potato wedges diatasnya ada scrambled egg + jagung + daun bawang + bawang goreng + topping, nah toppingnya ini macem-2, ada wagyu blackpepper, chuka idako, beef mozarella isi sosis, beef enoki, gurita, dll. Terus dituangin thai sauce plus cheese sauce!",
            "Pak Misari ini endulita banget sih lontong kupangnya \uD83D\uDC4F\uD83C\uDFFB kupangnya kecil2, bumbunya mantul dan bener bener semua pak Misari yang ngeracik.",
            "Aseli ya ini bebek bumbunya parah sih enaknya, sambal koreknya yang puedes, terus dimakan bareng sama nasi hangat omg \uD83D\uDE2D seenak itu!",
            "Super legendary, ngga berubah dari dulu tempat aslinya. Ya masuk di gang kecil, interior sama plek. Rasa juga suama persis! Tapi sekarang menumenunya udah makin banyak, ada penyetan, empal penyet, dll. Enak juga lho, kalo misal makan mie kurang kenyang masi bisa pesen nasi \uD83E\uDD2A porsi mienya juga bukan main, buanyak pol seh disini!",
            "BENER BENER MANTEPPPP BUANGET! \uD83D\uDE0D kuahnya super enak, gurih manisnya pas, kambingnya ga bau sama sekali, dagingnya empuk, nuagih pol pol an! Wajib minta ekstra kerupuk emping, plus dipedesin pake sambel. Nuagih pol, wajib cobain!\n" +
            "Buat temen temen yang ga makan kambing ga usah khawatir, karena ada yang sapi juga lho. Daging sapinya empuk, dan juga ada kaki sapi. Lagi lagi, ga ada bau bau kambing, beneran enak deh, cobain sendiri aja biar tau rasanyaa!",
            "MEMANG BELUT YANG SATU INI GA ADA DUANYA \uD83D\uDE0D✨ pecel belut bu yuli di Dharmahusada ini favoriteku banget!! \uD83D\uDE0D seporsi belutnya dapet buaaanyak pol, sambelnya juga banyak (jangan lupa request super pedes!!) dan bawang putih gorengnya juga gokil bgt deh.",
            "Sarapan nasi kuning avon di Darmo.. enak bangett!! \uD83E\uDD24\uD83E\uDD24 lauk tongkolnya ter the best, sambelnya pedes, recommend!",
            "Rujak cingur legend di Surabaya, Rujak Cingur Delta\uD83D\uDE0B petisnya enak, porsinya juga banyak. Very recommend! Ngga afdol ke Surabaya kalo ga cobain rujak cingur yang satu ini."
    };

    private static int[] arrPhoto = {
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.lima,
            R.drawable.enam,
            R.drawable.tujuh,
            R.drawable.delapan,
            R.drawable.sembilan,
            R.drawable.sepuluh
    };

    private static String[] arrLokasi = {
            "Warung Wader \"Kedai Kincir\"",
            "FishMonger Resto & Cafe",
            "Phi Phi Thai Street Food",
            "Lontong Kupang Pak Misari",
            "Bebek Canggih",
            "Mie Kedondong",
            "Bang Oya Sop Kaki Kambing",
            "Spesial Belut Bu Yuli",
            "Nasi Kuning Avon",
            "Rujak Cingur Delta Plaza"

    };

    private static String[] arrAlamat = {
            "Jl. Ketintang Selatan No.200, Surabaya",
            "Jalan Raya Mulyosari No 173, Surabaya",
            "Terrace 18 - The Square Ballroom, Surabaya",
            "Jalan Mojopahit No 9, Sidoarjo",
            "Jalan Bagong Ginayan IV/49, Surabaya",
            "Jalan Kedondong Lor I/7, Surabaya",
            "Jalan Mayjend Sungkono No 2, Surabaya",
            "Jalan Dharmahusada No 112, Surabaya",
            "Jl. Lusi No. 7, Tegalsari, Surabaya",
            "Plaza Surabaya Lt. 2, No.33, Jl. Pemuda, Surabaya"
    };

    private static String[] arrTelepon = {
            "081331346033",
            "08113311161",
            "081285472726",
            "08123520996",
            "081703586395",
            "0315313248",
            "081331555181",
            "083857016655",
            "085730270623",
            "0315315088"
    };

    private static String[] arrMap = {
            "MPGC+GJ Karah, Surabaya City, East Java",
            "PQHW+QQ Kalisari, Surabaya City, East Java",
            "PPPR+58 Kedungdoro, Surabaya City, East Java",
            "GPQ8+6V Sidokare, Sidoarjo Regency, East Java",
            "PP9X+WP Ngagel, Surabaya City, East Java",
            "PPJQ+3V Embong Kaliasin, Surabaya City, East Java",
            "PQ6H+68 Klampis Ngasem, Surabaya City, East Java",
            "PQC6+C9 Airlangga, Surabaya City, East Java",
            "PP6R+HC Keputran, Surabaya City, East Java",
            "PPPX+3F Embong Kaliasin, Surabaya City, East Java"
    };

    private static String[] arrHarga = {
            "Rp. 21.000",
            "Rp. 45.000",
            "Rp. 30.000",
            "Rp. 10.000",
            "Rp. 25.000",
            "Rp. 24.000",
            "Rp. 32.000",
            "Rp. 25.000",
            "Rp. 18.000",
            "Rp. 35.000"
    };

    private static String[] arrRating = {
            "4/5",
            "1/5",
            "3/5",
            "4/5",
            "2/5",
            "4/5",
            "3/5",
            "5/5",
            "3/5",
            "4/5"
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < arrNama.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama(arrNama[position]);
            makanan.setDeskripsi(arrDeskripsi[position]);
            makanan.setPhoto(arrPhoto[position]);
            makanan.setLokasi(arrLokasi[position]);
            makanan.setAlamat(arrAlamat[position]);
            makanan.setTelp(arrTelepon[position]);
            makanan.setMap(arrMap[position]);
            makanan.setHarga(arrHarga[position]);
            makanan.setRating(arrRating[position]);
            list.add(makanan);
        }
        return list;
    }
}
