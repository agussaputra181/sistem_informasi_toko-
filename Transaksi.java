package sisteminformasitoko;// nama package (folder) tempat file ini berada
/**
 * Class Transaksi -- mendemonstrasikan relasi ASSOCIATION (P4):
 * Transaksi "mengetahui" Pelanggan dan Produk, tapi keduanya tetap
 * berdiri sendiri (independen) walau object Transaksi ini dihapus.
 */
public class Transaksi {// membuat class bernama Transaksi
    private Pelanggan pembeli;// menyimpan pelanggan yang membeli
    private Produk produk;// menyimpan produk yang dibeli
    private int jumlahBeli;// menyimpan jumlah barang yang dibeli

    public Transaksi(Pelanggan pembeli, Produk produk, int jumlahBeli) {// constructor: dipakai saat membuat transaksi baru
        this.pembeli = pembeli;// isi data pembeli
        this.produk = produk;// isi data produk
        this.jumlahBeli = jumlahBeli;// isi jumlah beli
    }

    public double hitungTotalBayar() {// method untuk menghitung total bayar
        return produk.getHarga() * jumlahBeli;// harga produk dikali jumlah beli
    }

    public void cetakStruk() {// method untuk menampilkan struk
        System.out.println("--- STRUK PEMBELIAN ---");// tampilkan judul struk
        System.out.println("Pembeli : " + pembeli.getNama()); // tampilkan nama pembeli
        System.out.println("Produk  : " + produk.getNama()); // tampilkan nama produk
        System.out.println("Jumlah  : " + jumlahBeli);// tampilkan jumlah beli
        System.out.println("Total   : Rp" + hitungTotalBayar());// tampilkan total bayar
        System.out.println("-----------------------");// tampilkan garis penutup
    }
}// selesai class Transaksi
