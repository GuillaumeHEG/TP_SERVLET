package ch.hesge.generique;

// Le Code compile
// AGL OK
// Utilisation du diamond code pour le générique

public class Generic9<T> {

    private final T t;

    public Generic9(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic9<? extends Number> g = new Generic9<>(1);
        Object t = g.t;
    }
}