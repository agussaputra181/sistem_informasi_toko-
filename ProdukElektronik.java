package sisteminformasitoko;// nama package (folder) tempat file ini berada
/**
 * Subclass Produk khusus elektronik.
 * Sama seperti ProdukMakanan, tapi atribut tambahannya masa garansi.
 */
public class ProdukElektronik extends Produk {// class ProdukElektronik mewarisi (extends) class Produk
    private int garansiBulan;// tempat menyimpan lama garansi dalam bulan

    public ProdukElektronik(String nama, double harga, int stok, int garansiBulan) {// constructor: dipakai saat membuat produk elektronik
        super(nama, harga, stok);// panggil constructor Produk untuk isi nama/harga/stok
        this.garansiBulan = garansiBulan;// isi lama garansi
    }

    @Override // tanda bahwa method ini menggantikan method milik Produk
    public String tampilkanInfo() {// method untuk membuat teks info produk elektronik
        return super.tampilkanInfo() + " | Garansi: " + garansiBulan + " bulan";// info dari Produk ditambah lama garansi
    }
}// selesai class ProdukElektronik
