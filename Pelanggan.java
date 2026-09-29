package sisteminformasitoko;// nama package (folder) tempat file ini berada
/**
 * Class Pelanggan -- sederhana, dipakai untuk relasi Association
 * dengan Transaksi (materi P4).
 */
public class Pelanggan { // membuat class bernama Pelanggan
    private String nama; // tempat menyimpan nama pelanggan
    private String noHp; // tempat menyimpan nomor HP pelanggan

    public Pelanggan(String nama, String noHp) {// constructor: dipakai saat membuat pelanggan baru
        this.nama = nama; // isi atribut nama dengan nama yang diberikan
        this.noHp = noHp;// isi atribut noHp dengan nomor yang diberikan
    }// selesai constructor

    public String getNama() {// method untuk mengambil nama pelanggan
        return nama;// kirim nilai nama
    }// selesai method getNama
}// selesai class Pelanggan
