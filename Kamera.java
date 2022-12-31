
public abstract class Kamera implements ListKamera {
    public abstract int masuk();
    public abstract int harga();
    public abstract int out();
    public abstract int pembayaran();

    @Override
    public void DaftarHargaDSLR() {
        System.out.println("============KAMERA DSLR=============");
        System.out.println("| 1. Nikon D5200, 30000/hari       |");
        System.out.println("| 2. Canon EOS 6D, 40000/hari      |");
        System.out.println("| 3. Sonu DSC H300, 50000/hari     |");
        System.out.println("====================================");
    }

    @Override
    public void DaftarHargaANALOG() {
        System.out.println("============KAMERA ANALOG==========");
        System.out.println("| 1. Pentax K1000, 50000/hari     |");
        System.out.println("| 2. Ricoh KR-5, 60000/hari       |");
        System.out.println("| 3. Olympus OM-1, 70000/hari     |");
        System.out.println("===================================");
    }
}
