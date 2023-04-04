package Sem3;

import java.util.*;

public  class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        numbers.add(rnd.nextInt(11));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        }
    }


