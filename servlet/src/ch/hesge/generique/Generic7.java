package ch.hesge.generique;

// Le Code compile
// AGL OK
// Utilisation du diamond code pour le générique

public class Generic7<T> {

    private final T t;

    public Generic7(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic7<?> g = new Generic7<>(new Object());
        Object t = g.t;
    }
}