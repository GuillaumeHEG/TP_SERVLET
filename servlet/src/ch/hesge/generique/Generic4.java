package ch.hesge.generique;


// Le Code compile
// AGL OK
// Non utilisation du générique dans la class

public class Generic4<T> {

    public Generic4(T t) {}

    public static void main(String... args) {
        Generic4 g = new Generic4(new Object());
    }
}

