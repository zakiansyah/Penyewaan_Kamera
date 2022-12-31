import java.util.Scanner;

public  class Analog extends Kamera {
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
    public int harga() {
        if (pilih == 1) {
            harga = 50000;
            System.out.println(" 1. Pentax K1000, 50000/hari");
            System.out.println("Masukkan berapa lama anda ingin menyewa = ");
            hari = input.nextInt();
            total = harga * hari;
        } else if (pilih == 2) {
            harga = 60000;
            System.out.println(" 2. Ricoh KR-5, 60000/hari");
            System.out.println("Masukkan berapa lama anda ingin menyewa = ");
            hari = input.nextInt();
            total = harga * hari;
        } else if (pilih == 3) {
            harga = 70000;
            System.out.println(" 3. Olympus OM-1, 70000/hari");
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
            System.out.println("Kamera yang Anda Pilih Adalah Pentax K1000");
            System.out.println("Total yang harus anda bayarkan adalah = " + total);
        } else if (pilih == 2) {
            System.out.println("Kamera yang Anda Pilih Adalah Ricoh KR-5");
            System.out.println("Total yang harus anda bayarkan adalah = " + total);
        } else if (pilih == 3) {
            System.out.println("Kamera yang Anda Pilih Adalah Olympus OM-1");
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