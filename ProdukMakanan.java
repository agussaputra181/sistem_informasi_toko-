package sisteminformasitoko;// nama package (folder) tempat file ini berada
/**
 * Subclass Produk khusus makanan.
 * Materi: Inheritance & Polymorphism (P5)
 * Mewarisi semua atribut & method Produk, DITAMBAH atribut khas
 * makanan (tanggal kadaluwarsa), dan method tampilkanInfo() di-override
 * supaya menampilkan info tambahan itu.
 */
public class ProdukMakanan extends Produk {// class ProdukMakanan mewarisi (extends) class Produk
    private String tanggalKadaluwarsa;// tempat menyimpan tanggal kadaluwarsa

    public ProdukMakanan(String nama, double harga, int stok, String tanggalKadaluwarsa) {// constructor: dipakai saat membuat produk makanan
        super(nama, harga, stok);   // panggil constructor Produk untuk isi nama/harga/stok
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;// isi tanggal kadaluwarsa
    }

    @Override// tanda bahwa method ini menggantikan method milik Produk
    public String tampilkanInfo() {// method untuk membuat teks info produk makanan
        return super.tampilkanInfo() + " | Kadaluwarsa: " + tanggalKadaluwarsa; // info dari Produk ditambah tanggal kadaluwarsa
    }
}// selesai class ProdukMakanan
