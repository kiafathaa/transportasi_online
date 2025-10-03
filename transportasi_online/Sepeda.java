class Sepeda extends Transportasi {
    public Sepeda(String nama, int tarifDasar) {
        super(nama, tarifDasar);
    }

    @Override
    public int hitungBiaya(int jarak) {
        return tarifDasar * jarak; // tanpa promo
    }
}
