package ch.hesge.generique;

public class Generic13<T> {

    public T t;

    public static void main(String... args) {
        Generic13<? super Number> g = new Generic13<>();
        g.t = 1;
    }
}