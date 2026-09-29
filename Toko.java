package sisteminformasitoko;// nama package (folder) tempat file ini berada
import java.util.ArrayList;// memanggil ArrayList untuk membuat daftar

/**
 * Class Toko -- mendemonstrasikan relasi COMPOSITION (P4):
 * daftar Produk dibuat dan dikelola sepenuhnya di dalam Toko.
 */
public class Toko {// membuat class bernama Toko
    private String namaToko;// tempat menyimpan nama toko
    private ArrayList<Produk> daftarProduk;// tempat menyimpan daftar produk

    public Toko(String namaToko) {// constructor: dipakai saat membuat toko baru
        this.namaToko = namaToko;// isi nama toko
        this.daftarProduk = new ArrayList<>();// buat daftar produk yang masih kosong
    }

    public void tambahProduk(Produk p) {// method untuk menambah produk ke daftar
        daftarProduk.add(p);// masukkan produk ke daftar
    }

    public ArrayList<Produk> getDaftarProduk() {// method untuk mengambil daftar produk
        return daftarProduk;// kirim daftar produk
    }

    // Method ini contoh nyata POLYMORPHISM (P5): satu perintah tampilkanInfo()
    // yang sama, tapi hasilnya beda tergantung jenis produknya (biasa/makanan/elektronik)
    public void tampilkanSemuaProduk() {// method untuk menampilkan semua produk
        System.out.println("=== Daftar Produk " + namaToko + " ===");// tampilkan judul daftar
        for (int i = 0; i < daftarProduk.size(); i++) {// ulangi untuk setiap produk di daftar
            System.out.println((i + 1) + ". " + daftarProduk.get(i).tampilkanInfo());// tampilkan nomor urut dan info produk
        }
    }
}// selesai class Toko
