package datastructures.arraylist;

import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        System.out.println("Adding elements: " +add());
        System.out.println("Setting elements: " + set());
        System.out.println("removing elements: " + remove());
        iterate();
        get();
        addBetweenTwoNumbers();
        sort();
        size();
    }

    public static ArrayList<Integer> add(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        return numbers;
    }
    public static ArrayList<Integer> set(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        numbers.set(1,11); // updating element at index 1;
        return numbers;
    }
    public static ArrayList<Integer> remove(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        numbers.set(1,11); // updating element at index 1;
        numbers.remove(0);//removing element at index 0;
        return numbers;
    }
    public static void iterate() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

    public static void get(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        System.out.println("elements in get method: " +numbers);
        Integer n = numbers.get(1);
        System.out.println("Getting the element after using get method: " + n);
    }
    public static void addBetweenTwoNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2, 3);
        System.out.println(numbers);
    }
    public static void sort(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        System.out.println("Before sorting : " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting : " + numbers);

    }
    public static void size(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);
        int s = numbers.size();
        System.out.println("Size of the given array list: " +s);
    }
}
