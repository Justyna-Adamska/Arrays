package org.example;
import java.util.Set;
import java.util.HashSet;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Stwórz dwa HashSety integerów i zaimplementuj dla nich następujące działania rachunków zbiorów:
        // suma, część wspólna, różnica, suma bez części wspólnej.
        // Wynik działania powinien trafić do trzeciego zbioru.

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(13);
        numbers.add(22);
        numbers.add(-34);
        numbers.add(10000);

        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(13);
        numbers2.add(22);
        numbers2.add(-45);
        numbers2.add(1500);

        HashSet<Integer> sum = new HashSet<>();

        for (int number : numbers) {
            sum.add(number);
        }
        for (int number2 : numbers2) {
            sum.add(number2);
        }
        System.out.println(sum);
// A-B
        HashSet<Integer> sum1 = new HashSet<>();

        for (int number : numbers) {
            sum1.add(number);
        }
        for (int number2 : numbers2) {
            sum1.remove(number2);
        }
        System.out.println(sum1);

        // B-A

        HashSet<Integer> sum2 = new HashSet<>();

        for (int number2 : numbers2) {
            sum2.add(number2);
        }
        for (int number : numbers) {
            sum2.remove(number);
        }
        System.out.println(sum2);

        //Intercection
//        for (int number : numbers) {
//            sum.add(number);
//        }
//        for (int number2 : numbers2) {
//            sum.add(number2);
//        }
//        HashSet<Integer> inter1 = new HashSet<>();
//
//        inter1 = sum.remove(sum1);
//        HashSet<Integer> inter2 = new HashSet<>();
//        inter2 = inter1.remove(sum2);
/////////
//        HashSet<Integer> sum3 = new HashSet<>();
//
//        for (int number : numbers) {
//            sum3.add(number);
//
//        }
//        for (int number2 : numbers2) {
//            sum3.add(number2);
//
//        }
        for (int number : numbers) {
            for (int number2 : numbers2) {
                if (number == number2) {
//                    HashSet<Integer> inter = new HashSet<>();
//                    inter = number;
                    System.out.println(number);
                }
            }
        }

        //////////////


    }
}


