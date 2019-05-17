package ch.hesge.generique;


// Le Code compile
// AGL OK
// Utilisation du diamond code pour le générique

public class Generic5<T> {

    public Generic5(T t) {}

    public static void main(String... args) {
        Generic5 g = new Generic5<>(new Object());
    }
}