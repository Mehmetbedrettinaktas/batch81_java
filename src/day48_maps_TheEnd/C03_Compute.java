package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {

        Map<String, Integer> harfMap = new HashMap<>();
        harfMap.put("A", 5);
        harfMap.put("B", 1);
        harfMap.put("C", 2);
        harfMap.put("D", 4);
        harfMap.put("E", 4);
        System.out.println("harfMap = " + harfMap); // harfMap = {A=5, B=1, C=2, D=4, E=4}

        harfMap.compute("A", (k, v) -> v * 2 + 3);
        System.out.println("harfMap = " + harfMap); // harfMap = {A=13, B=1, C=2, D=4, E=4}
        harfMap.compute("D", (a, b) -> b * b);
        System.out.println("harfMap = " + harfMap); //harfMap = {A=13, B=1, C=2, D=16, E=4}

        harfMap.computeIfAbsent("C", (v) -> 30); //computeIfAbsent istenen key degeri map'de yoksa o key' ve value'yu ekler
        System.out.println("harfMap = " + harfMap); // harfMap = {A=13, B=1, C=2, D=16, E=4}

        harfMap.computeIfAbsent("F", (v) -> 30);
        System.out.println("harfMap = " + harfMap); // harfMap = {A=13, B=1, C=2, D=16, E=4, F=30}

       harfMap.computeIfPresent("E",(k,v)->v+5);
        System.out.println("harfMap = " + harfMap); // harfMap = {A=13, B=1, C=2, D=16, E=9, F=30}

        harfMap.computeIfPresent("G",(k,v)->v+5);
        System.out.println("harfMap = " + harfMap);



    }
}
