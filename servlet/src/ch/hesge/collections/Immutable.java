package ch.hesge.collections;

import java.util.ArrayList;
import java.util.List;

public class Immutable {

    private final List bar;

    Immutable(List bar){
        this.bar = new ArrayList(bar);
    }

    public List getBar(){
        return new ArrayList(bar);
    }

}
