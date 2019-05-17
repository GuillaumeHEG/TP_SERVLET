package ch.hesge.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Wrapper {
    private final int id;

    public Wrapper(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Wrapper && this.id == ((Wrapper) o).id;
    }

    @Override
    public int hashCode() {

        // La map aura une recherche lente car tout les objects seront stocké au même endroit
        return Objects.hash(id);
    }

    public static void main(String... args) {
        Map map = new HashMap(10_000_000);
        for (int i = 0; i < map.size(); i++) {
            Wrapper w = new Wrapper(i);
            map.put(w, w);
        }
    }
}