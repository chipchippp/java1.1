package comparison;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] ary = {1,2,3,4,5};
        int [] ary2 = {1,2,3,4,5};
        int [] ary3 = {1,2,3,4};
        System.out.println("Is array 1 equal to array 2?? "+
                Arrays.equals(ary, ary2));
        System.out.println("Is array 1 equal to array 3?? "+
                Arrays.equals(ary, ary3));
    }
}
