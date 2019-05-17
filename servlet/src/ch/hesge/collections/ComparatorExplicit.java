package ch.hesge.collections;

import java.util.Comparator;

public class ComparatorExplicit implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Type t1 = Type.getType(o1);
        Type t2 = Type.getType(o2);

        int resultType = ((Integer)t1.order()).compareTo(t2.order());

        if (resultType == 0){
            return o1.toString().compareTo(o2.toString());
        }
        else {
            return resultType;
        }
    }


    public enum Type{
        Integer {
            @Override
            public int order(){
                return 0;
            }
        }, String{
            @Override
            public int order(){
                return 5;
            }
        }, NoneObject{
            @Override
            public int order(){
                return 10;
            }
        }, Object{
            @Override
            public int order(){
                return 15;
            }
        }, Null{
            @Override
            public int order(){
                return 20;
            }
        };

        public int order(){
            return 0;
        }

        static Type getType(Object obj){

            if (obj == null){
                return Null;
            }
            else if (obj instanceof Integer){
                return Integer;
            }
            else if (obj instanceof String){
                return String;
            }
            else if (obj.getClass() != Object.getClass()){
                return NoneObject;
            }
            else if (obj.getClass() == Object.getClass()){
                return Object;
            }

            else {
                throw new IllegalArgumentException();
            }
        }


    }
}
