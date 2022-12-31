import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int menu;
        char ulang;
        do {
            System.out.println("=============================================");
            System.out.println("|     SELAMAT DATANG DI PENYEWAAN KAMERA    |");
            System.out.println("|              MASA RENTAL KAMERA           |");
            System.out.println("=============================================");
            System.out.println("|   Silahkan Pilih Menu                     |");
            System.out.println("|1. Sewa Kamera                             |");
            System.out.println("|2. Pengembalian Kamera                     |");
            System.out.println("|3. Keluar                                  |");
            System.out.println("=============================================");
            menu = input.nextInt();
            if (menu == 1) {
                Petugas ps = new Petugas();
                Scanner Pemilik_sewa = new Scanner(System.in);
                System.out.println("=====PETUGAS=====");
                System.out.println("Masukkan Nama = ");
                ps.nama = Pemilik_sewa.nextLine();
                System.out.println("Masukkan NO HP = ");
                ps.no_telp = Pemilik_sewa.nextInt();

                Penyewa pyw = new Penyewa();
                Pengembalian pgb = new Pengembalian();
                Scanner penyewa = new Scanner(System.in);
                Scanner Pengembalian = new Scanner(System.in);
                System.out.println("=====PENYEWA=====");
                System.out.println("Masukkan Nama = ");
                pyw.nama_penyewa = penyewa.nextLine();
                System.out.println("Masukkan Alamat Anda = ");
                pyw.alamat = penyewa.nextLine();
                System.out.println("Masukkan NO KTP = ");
                pyw.noktp = penyewa.nextInt();
                System.out.println("Masukkan NO HP = ");
                pyw.notelp = penyewa.nextInt();
                System.out.println("Masukkan Tanggal Pinjam = ");
                pgb.tanggal_pinjam= Pengembalian.nextInt();
                System.out.println("Masukkan Tanggal Kembali = ");
                pgb.tanggal_kembali= Pengembalian.nextInt();


                System.out.println("=====Masukkan Pilihan Anda=====");
                System.out.println("      1. DSLR                  ");
                System.out.println("      2. ANALOG                ");
                System.out.println("===============================");
                angka = input.nextInt();
                java.io.File file = new java.io.File("struk.txt");
                try {
                    java.io.PrintWriter output = new java.io.PrintWriter(file);
                    if (angka == 1) {
                        Dslr aku = new Dslr();
                        aku.DaftarHargaDSLR();
                        aku.masuk();
                        aku.harga();
                        System.out.println("==========DATA SEWA===========");
                        System.out.println("Nama Petugas = " + ps.getNama());
                        System.out.println("No.Hp : " + ps.getNo_telp());
                        System.out.println("Nama Penyewa = " + pyw.getNama_penyewa());
                        System.out.println("No KTP = " + pyw.getNoktp());
                        System.out.println("No HP = " + pyw.getNotelp());
                        System.out.println("Alamat = " + pyw.getAlamat());
                        System.out.println("Tanggal Pinjam = "+pgb.getTanggal_pinjam()+ " Desember 2022");
                        System.out.println("Tanggal Pinjam = "+pgb.getTanggal_kembali()+ " Desember 2022");
                        output.println("======================================================");
                        output.println("                 MASA RENTAL KAMERA                  ");
                        output.println("======================================================");
                        output.println("Nama Petugas                :"+ps.getNama());
                        output.println("No Telpon petugas           :"+ps.getNo_telp());
                        output.println("======================================================");
                        output.println("Nama Anda                   :"+pyw.getNama_penyewa());
                        output.println("Nomor Identitas Anda        :"+pyw.getNoktp());
                        output.println("Nomor Telpon Anda           :"+pyw.getNotelp());
                        output.println("Alamat Anda                 :"+pyw.getAlamat());
                        output.println("Tanggal Pinjam              :"+pgb.getTanggal_pinjam()+" Desember 2022");
                        output.println("Tanggal Kembali             :"+pgb.getTanggal_kembali()+" Desember 2022");
                        output.println("harga Kamera Yang Anda Sewa :"+aku.out());// ini untuk manggil yg di kelas dslr tadi tapi eror di txtnya
                        output.println("kembalian                   :"+aku.pembayaran());
                        output.println("======================================================");
                        output.println("  Untuk Pengembalian Kamera, Struk Tetap Dibawa Yaa   ");
                        output.println("    Terima Kasih Atas Kunjungan Anda Ke Toko Kami     ");
                        output.println("======================================================");
                        output.close();
                    } else if (angka == 2) {
                        Analog aku = new Analog();
                        aku.DaftarHargaANALOG();
                        aku.masuk();
                        aku.harga();
                        System.out.println("==========DATA SEWA===========");
                        System.out.println("Nama Petugas = " + ps.getNama());
                        System.out.println("No.Hp : " + ps.getNo_telp());
                        System.out.println("Nama Penyewa = " + pyw.getNama_penyewa());
                        System.out.println("No KTP = " + pyw.getNoktp());
                        System.out.println("No HP = " + pyw.getNotelp());
                        System.out.println("Alamat = " + pyw.getAlamat());
                        System.out.println("Tanggal Pinjam = "+pgb.getTanggal_pinjam()+" Januari 2023");
                        System.out.println("Tanggal Pinjam = "+pgb.getTanggal_kembali()+" Januari 2023");
                        output.println("======================================================");
                        output.println("                 MASA RENTAL KAMERA                   ");
                        output.println("======================================================");
                        output.println("Nama Petugas                :"+ps.getNama());
                        output.println("No Telpon petugas           :"+ps.getNo_telp());
                        output.println("======================================================");
                        output.println("Nama Anda                   :"+pyw.getNama_penyewa());
                        output.println("Nomor Identitas Anda        :"+pyw.getNoktp());
                        output.println("Nomor Telpon Anda           :"+pyw.getNotelp());
                        output.println("Alamat Anda                 :"+pyw.getAlamat());
                        output.println("Tanggal Pinjam              :"+pgb.getTanggal_pinjam()+" Januari 2023");
                        output.println("Tanggal Kembali             :"+pgb.getTanggal_kembali()+" Januari 2023");
                        output.println("harga Kamera Yang Anda Sewa :"+aku.out());// ini untuk manggil yg di kelas dslr tadi tapi eror di txtnya
                        output.println("kembalian                   :"+aku.pembayaran());
                        output.println("======================================================");
                        output.println("  Untuk Pengembalian Kamera, Struk Tetap Dibawa Yaa   ");
                        output.println("    Terima Kasih Atas Kunjungan Anda Ke Toko Kami     ");
                        output.println("======================================================");
                        output.close();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("ada error");
                }
            }
            else if (menu == 2) {
                Penyewa pyw = new Penyewa();
                Pengembalian pgb = new Pengembalian();
                Scanner Pengembalian = new Scanner(System.in);
                Scanner penyewa = new Scanner(System.in);
                java.io.File file = new java.io.File("struk.txt");
                try {
                    java.io.PrintWriter output = new java.io.PrintWriter(file);
                    System.out.println("=====PENYEWA=====");
                    System.out.println("Masukkan Nama = ");
                    pyw.nama_penyewa = penyewa.nextLine();
                    System.out.println("Masukkan Alamat Anda = ");
                    pyw.alamat = penyewa.nextLine();
                    System.out.println("Masukkan NO KTP = ");
                    pyw.noktp = penyewa.nextInt();
                    System.out.println("Masukkan NO HP = ");
                    pyw.notelp = penyewa.nextInt();
                    System.out.println("Masukkan Tanggal Pinjam = ");
                    pgb.tanggal_pinjam = Pengembalian.nextInt();
                    System.out.println("Masukkan Tanggal Kembali = ");
                    pgb.tanggal_kembali = Pengembalian.nextInt();
                    System.out.println("Masukkan Berapa Hari Anda Telat ");
                    System.out.println("Jika tidak ada inputkan 0");
                    pgb.telat = Pengembalian.nextInt();

                    System.out.println("==========DATA KEMBALI===========");
                    System.out.println("Nama Penyewa = " + pyw.getNama_penyewa());
                    System.out.println("No KTP = " + pyw.getNoktp());
                    System.out.println("No HP = " + pyw.getNotelp());
                    System.out.println("Alamat = " + pyw.getAlamat());
                    System.out.println(("Tanggal Pinjam = "+pgb.getTanggal_pinjam())+" Desember 2022");
                    System.out.println(("Tanggal kembali = "+pgb.getTanggal_kembali()+"Desember 2022"));
                    System.out.println("Denda Anda = "+pgb.getDenda());
                    output.println("=====================================================");
                    output.println("                 MASA RENTAL KAMERA                  ");
                    output.println("=====================================================");
                    output.println("Nama Anda                   :"+pyw.getNama_penyewa());
                    output.println("Nomor Identitas Anda        :"+pyw.getNoktp());
                    output.println("Nomor Telpon Anda           :"+pyw.getNotelp());
                    output.println("Alamat Anda                 :"+pyw.getAlamat());
                    output.println("Tanggal Pinjam              :"+pgb.getTanggal_pinjam()+" Desember 2022");
                    output.println("Tanggal Kembali             :"+pgb.getTanggal_kembali()+" Desember 2022");
                    output.println("Keterlambatan Pengembalian  :"+pgb.getTelat()+" Hari");
                    output.println("Denda Anda                  :"+pgb.getDenda());
                    output.println("=====================================================");
                    output.println("    Terima Kasih Atas Kunjungan Anda Ke Toko Kami    ");
                    output.println("=====================================================");
                    output.close();
                } catch (Exception e) {
                    System.out.println("Terdapat Eror");
                    System.out.println("Silahkan Memasukkan Inputan Yang Benar");
                }
            }else {
                System.out.println("Terima Kasih Atas Kunjungan Anda Ke Toko Kami");
            }
            System.out.print("Ingin memilih menu lain (y/t)? ");
            ulang = input.next().charAt(0);
        }
        while (ulang!='t');
        System.out.println("Terima Kasih Atas Kunjungan Anda Ke Toko Kami");
    }
}

