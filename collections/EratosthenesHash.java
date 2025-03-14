package collections;

import java.util.HashSet;
import java.util.Set;

public class EratosthenesHash {
    public static void main(String[] args) {
        Set<Integer> era = new HashSet<>();
        int n = 81;

        for (int i = 2; i <= n; i++) {
            era.add(i);
        }

        int smallest = 2; 

        while (smallest * smallest <= n) {
            for (int multiple = smallest * smallest; multiple <= n; multiple += smallest) {
                era.remove(multiple);
            }

            do {
                smallest++;
            } while (!era.contains(smallest) && smallest <= n);
        }

        System.out.println("Prime numbers up to " + n + ": " + era);
    }
}
