package com.example.uts_mobile1_haris_rachman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PortalNewsActivity extends AppCompatActivity {

    ListView listView;

    String[] titles = {
            "Jepang Tunda Pasang Penghalang Pemandangan Gunung Fuji di Depan Lawson",
            "Daftar 10 Pantai Terbaik di Dunia 2024, Ada dari Indonesia",
            "Elon Musk Ungkap Nasib Starlink saat Badai Matahari Dahsyat Serbu Bumi",
            "Badai Matahari Paling Ekstrem dalam 20 Tahun Terakhir Hantam Bumi",
            "Alasan Robot Sejauh ini Belum Bisa Saingi Hewan"
            };
    String[] contents = {
            "Wisatawan mempunyai waktu beberapa hari lagi untuk memotret Gunung Fuji di tempat yang populer di Kota Fujikawaguchiko, setelah pihak berwenang Jepang mengatakan pemasangan penghalang ditunda.\n\nKota Fujikawaguchiko bakal memasang layar penutup untuk mencegah orang mengambil gambar Gunung Fuji, landmark paling terkenal di Jepang dari trotoar di seberang toko Lawson kota tersebut.\n\nWarga lokal mengeluh bahwa para pengunjung menyebabkan masalah lalu lintas dan berperilaku buruk, karena putus asa untuk mendapatkan postingan Instagram yang sempurna untuk foto berlatar Gunung Fuji yang tertutup salju.",
            "Di posisi teratas atau peringkat pertama Pantai Terbaik di Dunia 2024 ditempati Teluk Trunk di St John di Kepulauan Virgin, Amerika Serikat.\n\nTeluk Trunk menonjol karena terletak di Taman Nasional Kepulauan Virgin alias statusnya dilindungi. Pantainya memiliki perairan seperti kolam dan pasir putih lembut seperti wilayah Karibia lainnya.\n\nDi peringkat kedua ada Cala Mariolu yang terdapat di Italia. Untuk mengetahui lebih lanjut, berikut daftar 20 pantau terbaik di dunia.\n\n1. Teluk Trunk di Kepulauan Virgin AS\n2. Cala Mariolu, Italia\n3. Teluk Meads, Anguilla\n4. Pantai Entalula, Filipina\n5. Pantai Voutoumi, Yunani\n6. Teluk Turquoise, Australia\n7. Pantai Pink, Indonesia\n8. Anse Georgette, Seychelles\n9. Green Lagoon, Polinesia Prancis\n10. Pulau Sepatu Kuda, Myanmar",
            "\"Badai matahari geomagnetik besar sedang terjadi saat ini. Terbesar dalam waktu yang lama,\" ungkap Elon Musk, CEO SpaceX yang mengoperasikan Starlink, dalam kicauannya di X, Sabtu (11/5).\n\n\"Satelit-satelit Starlink berada di bawah banyak tekanan, tetapi sejauh ini masih bertahan,\" aku dia.\n\nPusat Prediksi Cuaca Luar Angkasa di Lembaga Kelautan dan Atmosfer Nasional AS (NOAA) mengungkap Badai Matahari imbas lontaran massa koronal (CME), yang merupakan pelepasan plasma dan medan magnet dari Matahari, itu mencapai Bumi pada Jumat pukul 18.54 EDT (Sabtu, 05.54 WIB).",
            "Fenomena ini disebut menyebabkan padamnya listrik di Swedia dan merusak infrastruktur listrik di Afrika Selatan dan diprediksi lebih banyak melanda Bumi dalam beberapa hari mendatang.\n\nPihak berwenang memberi tahu operator satelit, maskapai penerbangan, dan jaringan listrik untuk mengambil langkah pencegahan terhadap potensi gangguan yang disebabkan oleh perubahan medan magnet bumi.\n\nTidak seperti jilatan api Matahari, yang bergerak dengan kecepatan cahaya dan mencapai Bumi dalam waktu sekitar delapan menit, CME bergerak dengan kecepatan yang lebih tenang.",
            "Meski jutaan dolar dikucurkan buat menciptakan robot yang dapat berjalan atau berlari seperti hewan, sampai saat ini teknologi tersebut masih banyak kelemahan jika dibandingkan hewan. Apa sebabnya?\n\n\"Seekor rusa kutub dapat bermigrasi sejauh ribuan kilometer melalui medan yang berat, kambing gunung dapat memanjat tebing, menemukan pijakan yang tampaknya tidak ada di sana, dan kecoa dapat kehilangan satu kaki dan tidak dapat melambat,\" kata Max Donelan, salah satu peneliti dari Profesor di Departemen Fisiologi dan Kinesiologi Biomedis Universitas Simon Fraser melansir Science Daily, Selasa (7/5).\n\n\"Kami belum memiliki robot yang mampu memiliki daya tahan, kelincahan, dan kekokohan seperti ini,\" lanjutnya."
            };
    Integer[] images = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portal_news_activity);

        listView = findViewById(R.id.listView);
        NewsAdapter adapter = new NewsAdapter(this, titles, contents, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PortalNewsActivity.this, NewsDetailActivity.class);
                intent.putExtra("title", titles[position]);
                intent.putExtra("content", contents[position]);
                intent.putExtra("image", images[position]);
                startActivity(intent);
            }
        });
    }
}