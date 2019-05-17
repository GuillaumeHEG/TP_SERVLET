package ch.hesge.generique;


// Le Code compile
// AGL OK
// Utilisation du diamond code pour le générique

public class Generic8<T> {

    public final T t;

    public Generic8(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic8<Object> g = new Generic8<>(new Object());
        Object t = g.t;
    }
}
