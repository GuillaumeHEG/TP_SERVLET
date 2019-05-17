package ch.hesge.generique;

// Le Code compile
// AGL OK
// Utilisation du joker pour lire une donnée "Number"

public class Generic10<T> {

    private final T t;

    public Generic10(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic10<? extends Number> g = new Generic10<>(1);
        Number t = g.t;
    }
}
