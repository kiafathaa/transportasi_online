public class MainApp {
    public static void main(String[] args) {
        Transportasi mobil = new Mobil("Mobil Avanza", 5000);
        Transportasi motor = new Motor("Motor Vario", 3000);
        Transportasi sepeda = new Sepeda("Sepeda Lipat", 1000);

        int jarak = 12;

        // Polymorphism (Overriding)
        System.out.println("Biaya Mobil: Rp" + mobil.hitungBiaya(jarak));
        System.out.println("Biaya Motor: Rp" + motor.hitungBiaya(jarak));
        System.out.println("Biaya Sepeda: Rp" + sepeda.hitungBiaya(jarak));

        // Overloading
        System.out.println("Biaya Mobil (dengan diskon): Rp" + mobil.hitungBiaya(jarak, 5000));

        // Interface
        PromoInterface promoMobil = (PromoInterface) mobil;
        PromoInterface promoMotor = (PromoInterface) motor;

        System.out.println("Promo Mobil: Rp" + promoMobil.hitungPromo(jarak));
        System.out.println("Promo Motor: Rp" + promoMotor.hitungPromo(jarak));
    }
}
