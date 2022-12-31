import java.util.Scanner;
public class Dslr extends Kamera {
    public int pilih;
    public int harga;
    public int hari;
    public int total;
    public int bayar;
    public int kembali;

    Scanner input = new Scanner(System.in);


    @Override
    public int masuk() {
        System.out.println("=====Masukkan Pilihan Anda=====");
        pilih = input.nextInt();
        return 0;
    }
    @Override
    public int harga() {                     //Nanti di pangil ke main
            if (pilih == 1) {
                harga = 30000;
                System.out.println(" 1. Nikon D5200, 30000/hari");
                System.out.println("Masukkan berapa lama anda ingin menyewa = ");
                hari = input.nextInt();
                total = harga * hari;
            } else if (pilih == 2) {
                harga = 40000;
                System.out.println(" 2. Canon EOS 6D, 40000/hari");
                System.out.println("Masukkan berapa lama anda ingin menyewa = ");
                hari = input.nextInt();
                total = harga * hari;
            } else if (pilih == 3) {
                harga = 50000;
                System.out.println(" 3. Soni DSC H300, 50000/hari");
                System.out.println("Masukkan berapa lama anda ingin menyewa = ");
                hari = input.nextInt();
                total = harga * hari;
            } else {
                System.out.println("Pilihan tidak tersedia ");
            }
            return harga;
    }
        @Override
        public int out() {
            if (pilih == 1) {
                System.out.println("Kamera yang Anda Pilih Adalah Nikon D5200");
                System.out.println("Total yang harus anda bayarkan adalah = " + total);
            } else if (pilih == 2) {
                System.out.println("Kamera yang Anda Pilih Adalah Canon EOS 6D");
                System.out.println("Total yang harus anda bayarkan adalah = " + total);
            } else if (pilih == 3) {
                System.out.println("Kamera yang Anda Pilih Adalah Soni DSC H300");
                System.out.println("Total yang harus anda bayarkan adalah = " + total);
            }
            return total;
    }

    @Override
    public int pembayaran() {
        System.out.println("Masukkan jumlah pembayaran ");
        bayar = input.nextInt();
        kembali=bayar-total;
        System.out.println("Kembalian anda "+kembali);
        System.out.println("Terima Kasih ");
        return kembali;
    }
}

