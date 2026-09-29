package sisteminformasitoko; // nama package (folder) tempat file ini berada
import java.util.Scanner;//agar program dapat menerima input dari pengguna, misalnya melalui keyboard.

/**
 * SISTEM INFORMASI TOKO - Program Utama (Interaktif)
 * Menggabungkan SEMUA materi Pertemuan 3-5:
 *   - Enkapsulasi   : atribut Produk private + validasi harga/stok
 *   - Class Diagram : relasi association (Transaksi) & composition (Toko)
 *   - Inheritance & Polymorphism : ProdukMakanan/ProdukElektronik meng-override tampilkanInfo()
 *
 * Program ini SENGAJA dibuat sederhana supaya bisa jadi PONDASI project
 * kalian -- nanti tinggal ditambah GUI (Pertemuan 12) dan database (Pertemuan 14).
 */
public class SistemTokoInteraktif {// class utama untuk menjalankan sistem toko
    public static void main(String[] args) {// method utama yang pertama dijalankan
        try (Scanner input = new Scanner(System.in)) {// membuat Scanner untuk membaca input keyboard
            Toko toko = new Toko("XD_Prime_Mart");// membuat objek toko dengan nama XD_Prime_Mart

            
            // ===== Data awal (boleh diubah/ditambah sendiri) =====
            toko.tambahProduk(new ProdukMakanan("Roti Tawar", 15000, 20, "25-09-2026"));// menambahkan produk makanan
            toko.tambahProduk(new ProdukElektronik("Kabel USB-C", 45000, 15, 6));// menambahkan produk elektronik
            toko.tambahProduk(new Produk("Buku Tulis", 5000, 50));// menambahkan produk biasa
            toko.tambahProduk(new Produk("Stopkontak",65000,20));// menambahkan produk elektronik
            toko.tambahProduk(new Produk("FiberCloth",35000,15));// menambahkan produk biasa
            
            System.out.println("=== SELAMAT DATANG DI SISTEM INFORMASI XD_Prime_Mart ===");// tampilkan ucapan selamat datang
            System.out.print("Masukkan nama Anda: ");// minta pengguna mengetik nama
            String namaPembeli = input.nextLine();// baca nama yang diketik
            Pelanggan pelanggan = new Pelanggan(namaPembeli, "-");// buat pelanggan baru 
            
            boolean lanjut = true;// tanda program masih berjalan
            while (lanjut) {// ulangi menu selama lanjut bernilai true
                System.out.println();// tampilkan baris kosong
                toko.tampilkanSemuaProduk();   // <-- di sinilah POLYMORPHISM kelihatan hasilnya
                System.out.println((toko.getDaftarProduk().size() + 1) + ". Keluar");// tampilkan menu Keluar
                System.out.print("Pilih nomor produk yang ingin dibeli: ");// minta pengguna memilih nomor
                int pilihan = Integer.parseInt(input.nextLine());// membaca pilihan produk dari pengguna
                
                if (pilihan == toko.getDaftarProduk().size() + 1) {// mengecek apakah pengguna memilih keluar
                    lanjut = false;// hentikan perulangan
                } else if (pilihan >= 1 && pilihan <= toko.getDaftarProduk().size()) {// mengecek apakah pilihan produk valid
                    Produk produkDipilih = toko.getDaftarProduk().get(pilihan - 1);// mengambil produk berdasarkan pilihan
                    System.out.print("Jumlah beli: ");// meminta jumlah produk yang ingin dibeli
                    int jumlah = Integer.parseInt(input.nextLine());// membaca jumlah pembelian
                    
                    if (produkDipilih.kurangiStok(jumlah)) {// mengecek dan mengurangi stok produk
                        Transaksi transaksi = new Transaksi(pelanggan, produkDipilih, jumlah);// membuat objek transaksi
                        System.out.println();// membuat baris kosong
                        transaksi.cetakStruk();// menampilkan struk transaksi
                    } else {
                        System.out.println(">> Maaf, stok tidak mencukupi.");// menampilkan pesan jika stok kurang
                    }
                } else {
                    System.out.println(">> Pilihan tidak valid."); // menampilkan pesan jika pilihan salah
                }
            }
            
            System.out.println("Terima kasih, " + pelanggan.getNama() + "!");// menampilkan ucapan terima kasih
        }
    }
}// menutup Scanner setelah program selesai
