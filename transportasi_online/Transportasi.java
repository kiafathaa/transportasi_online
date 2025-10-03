abstract class Transportasi {
    protected String nama;
    protected int tarifDasar;

    public Transportasi(String nama, int tarifDasar) {
        this.nama = nama;
        this.tarifDasar = tarifDasar;
    }

    // abstract method
    public abstract int hitungBiaya(int jarak);

    // method overloading
    public int hitungBiaya(int jarak, int diskon) {
        return (tarifDasar * jarak) - diskon;
    }
}
