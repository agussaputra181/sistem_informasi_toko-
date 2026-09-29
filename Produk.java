package sisteminformasitoko;// nama package (folder) tempat file ini berada
/**
 * SISTEM INFORMASI TOKO - Class Produk (superclass)
 * Materi: Enkapsulasi (P3) + dasar untuk Inheritance (P5)
 *
 * Semua atribut dibuat PRIVATE -- ini prinsip Enkapsulasi: data bisnis
 * (harga, stok) tidak boleh diubah sembarangan dari luar, harus lewat
 * method resmi yang sudah dilengkapi ATURAN BISNIS (validasi).
 */
public class Produk {// membuat class bernama Produk
    private String nama;// tempat menyimpan nama produk
    private double harga;// tempat menyimpan harga produk
    private int stok;// tempat menyimpan jumlah stok produk

    public Produk(String nama, double harga, int stok) {// constructor: dipakai saat membuat produk baru
        this.nama = nama;// isi nama produk
        this.harga = harga;// isi harga produk
        this.stok = stok;// isi stok produk
    }// selesai constructor produk

    public String getNama() {// method untuk mengambil nama produk
        return nama;// kirim nilai nama
    }

    public double getHarga() {// method untuk mengambil harga produk
        return harga;// kirim nilai harga
    }

    public int getStok() {// method untuk mengambil stok produk
        return stok;// kirim nilai stok
    }

    // ATURAN BISNIS: harga tidak boleh diubah jadi negatif
    public void setHarga(double hargaBaru) {// method untuk mengubah harga
        if (hargaBaru >= 0) {// cek: harga baru harus 0 atau lebih
            harga = hargaBaru;// harga boleh, jadi harga diganti
        } else {// kalau harga baru negatif
            System.out.println("Gagal: harga tidak boleh negatif");// tampilkan pesan gagal
        }
    }

    // ATURAN BISNIS: stok tidak boleh berkurang melebihi yang tersedia
    public boolean kurangiStok(int jumlah) {// method untuk mengurangi stok hasilnya true atau false
        if (jumlah > 0 && jumlah <= stok) {// cek: jumlah lebih dari 0 dan tidak melebihi stok
            stok -= jumlah;// kurangi stok sebanyak jumlah
            return true;// kirim true artinya berhasil
        }
        return false;// kirim false artinya gagal
    }

    public void tambahStok(int jumlah) {// method untuk menambah stok
        if (jumlah > 0) {// cek: jumlah harus lebih dari 0
            stok += jumlah;// tambah stok sebanyak jumlah
        }
    }

    // Method ini akan DI-OVERRIDE oleh subclass (ProdukMakanan, ProdukElektronik)
    public String tampilkanInfo() {// method untuk membuat teks info produk
        return nama + " | Rp" + harga + " | Stok: " + stok;// gabungkan nama, harga, dan stok jadi satu teks
    }
}// selesai class Produk
