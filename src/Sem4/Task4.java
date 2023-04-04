package Sem4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//1) Написать метод, который принимает массив элементов,
//        помещает их в стэк и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов, помещает
//        их в очередь и выводит на консоль содержимое очереди.
public class Task4 {


    public static int[] fillArray(){
        int [] myArray = new int[10];
        for (int i = 0; i <myArray.length ; i++) {
            myArray[i]=i+1;
        }
        return myArray;
    }
    public static void run (int[] array){
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            myStack.add(array[i]);
        }
        System.out.println(myStack);
        Queue<Integer> myQ = new LinkedList<>();
myQ.addAll(myStack);
        System.out.println(myQ);
        Deque<Integer> myD = new LinkedList<>(myQ);
        System.out.println(myD);
    }
}
