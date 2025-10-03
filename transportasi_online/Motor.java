class Motor extends Transportasi implements PromoInterface {
    public Motor(String nama, int tarifDasar) {
        super(nama, tarifDasar);
    }

    @Override
    public int hitungBiaya(int jarak) {
        return tarifDasar * jarak;
    }

    @Override
    public int hitungPromo(int jarak) {
        return (jarak > 5) ? 5000 : 0;
    }
}
