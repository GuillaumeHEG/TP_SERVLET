package ch.hesge.collections;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulationListe {

    public static int sum(List<Integer> liste){
        int sum = 0;
        for(Integer integer : liste){
            sum += integer.intValue();
        }
        return sum;
    }

    public static List<Object> group(List<Object> liste, TypeObject type){
        List<Object> object = new ArrayList();
        for (Object obj : liste){
            if (type == TypeObject.String && obj instanceof String){
               object.add(obj);
            } else if (type == TypeObject.Integer && obj instanceof Integer){
                object.add(obj);
            } else {
                object.add(obj);
            }
        }
        return object;
    }

    public static void main(String[] args) {
        int sum =  sum(Arrays.asList(1,4,5,12));
        System.out.println(sum);

        List<Object> obj = group(Arrays.asList(1,2,3, new Object(), "asd"), TypeObject.Others);
        for (Object o: obj) {
            System.out.println(o);
        }
    }

    public enum TypeObject{
        String,
        Integer,
        Others
    }

}

