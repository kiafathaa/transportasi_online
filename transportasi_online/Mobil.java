class Mobil extends Transportasi implements PromoInterface {
    public Mobil(String nama, int tarifDasar) {
        super(nama, tarifDasar);
    }

    @Override
    public int hitungBiaya(int jarak) {
        return tarifDasar * jarak + 5000; // biaya tambahan
    }

    @Override
    public int hitungPromo(int jarak) {
        return (jarak > 10) ? 10000 : 0;
    }
}
