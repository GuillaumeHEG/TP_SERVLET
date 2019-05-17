package ch.hesge.generique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic1 {

    public static void main(String[] args) {
        // Le Code Compile
        // AGL OK
        // Il compile car on indique le Type que la variable contient et nous respectons l'object dle type avec l'objet attribué
        ArrayList<Integer> integers1 = new ArrayList<Integer>();

        // Le Code Compile
        // AGL OK
        // Il compile car depuis java 7, car il arrive à récupérer le type grâce au diamond case
        List<Integer> integers2 = new ArrayList<>();

        // Le Code Compile
        // AGL OK
        // Il compile car depuis java 7, car il arrive à récupérer le type grâce au diamond case
        List<? extends Integer> integers3 = new ArrayList<>();

        // Le Code ne compile pas
        // AGL NOT OK
        // ? n'est pas un type d'objet mais un joker, la valeur T aurait pu marcher
        // List<? extends Integer> integers4 = new ArrayList<?>();

        // Le Code ne compile pas
        // AGL NOT OK
        // On ne peut ajouter que des élément de Integer mais les lire en int
        // List<? extends Integer> integers5 = new ArrayList<>();
        // integers5.add(1);

        // Le code compile
        // AGL OK
        // extends permet la lecture mais pas l'écriture
        List<? extends Integer> integers6 = Arrays.asList(1, 2, 3);
        integers6.get(1);

        // Le code compile
        // AGL OK
        // extends permet l'écriture mais pas la lecture
        List<? super Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);

        // Le code compile
        // AGL OK
        //
        List<? super Integer> numbers2 = Arrays.asList(1, 2, 3);
        numbers2.get(1);
    }


}


// Le Code compile
// AGL  OK
// Déclaration du générique dans la class
class Generic2<T> {


}

// Le Code compile
// AGL OK
// Déclaration du générique dans la class et d'une méthode utilisant T
 class Generic3<T> {

    public Generic3(T t) {}
}



// Le Code ne compile
// AGL NOT OK
// Utilisation du joker pour décalrer une variable

/*
 class Generic6<T> {

    private final T t;

    public Generic6(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic6<?> g = new Generic6<>(new Object());
        ? t = g.t;
    }
}*/


// Le Code ne compile
// AGL NOT OK
// La lecture d'un Number ne peut que retourner un Number, un Number n'est pas un integer


/*
 class Generic11<T> {

    private final T t;

    public Generic11(T t) {
        this.t = t;
    }

    public static void main(String... args) {
        Generic11<? extends Number> g = new Generic11<>(1);
        Integer t = g.t;
    }
}


// Le Code ne compile
// AGL NOT OK
// La lecture d'un Number ne peut pas être fait en appelant un super car il n'autorise que l'écriture


 class Generic12<T> {

     final T t;

     Generic12(T t) {
        this.t = t;
    }

     static void main(String... args) {
        Generic12<? super Number> g = new Generic12<>(1);
        Number t = g.t;
    }
}

*/


 class Generic14<T> {

     static class GenericChild<T> extends Generic14<T> {}
}

 class Generic15<T> {

     static class GenericChild extends Generic15<Number> {}
}
 class Generic16<T> {

     static class GenericChild<V> extends Generic16<Number> {}
}
/*
 class NotGeneric1 {

     void apply(T t) {}
}*/
 class NotGeneric2 {

    public <T> void apply(T t) {}
}
/*
 class NotGeneric3 {

     <V extends T> void apply(T t) {}
}
 class NotGeneric4 {

     <T extends V> void apply(T t) {}
}*/
 class NotGeneric5 {

     <T extends Number> void apply(T t) {}
}
/*
 class NotGeneric6 {

     <T> R apply(T t) {
        return (R) new Object();
    }
}*/
 class NotGeneric7 {

     <T, R> R apply(T t) {
        return (R) new Object();
    }
}
 class NotGeneric8 {

     <T, R extends Number> R apply(T t) {
        return (R) new Object();
    }
}
/*
 class NotGeneric9 {

     <T, R super Number> R apply(T t) {
        return (R) new Object();
    }
}*/
class NotGeneric10 {

    public <T, R extends Number> R apply(T t) {
        return (R) Integer.valueOf(1);
    }
}


// Le Code ne compile
// AGL NOT OK
// La lecture d'un Number ne peut pas être fait en appelant un super car il n'autorise que l'écriture


/*
 class LastButNotLeast1<T,V> {

     void apply<T> {}
     void apply<V> {}
}

*/