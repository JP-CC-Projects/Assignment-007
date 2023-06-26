package com.coderscampus.arraylist;

public class Main{
    public static void main(String[] args) {

        CustomList<Integer> customList = new CustomArrayList();

        // Testing zone: //
        System.out.println("Boolean value = " + customList.add(1));
        System.out.println("Array size/number of elements = " + customList.getSize());
        Integer pickIndex = 0;
        System.out.println("Element at index " + pickIndex + " = " + customList.get(pickIndex));

        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);
        customList.add(7);
        customList.add(8);
        customList.add(9);
        customList.add(10);
        customList.add(11);
        customList.add(12);
        customList.add(13);
        customList.add(14);
        customList.add(15);
        customList.add(16);
        customList.add(17);
        customList.add(18);
        customList.add(19);
        customList.add(20);
        customList.add(20, 100);
        customList.remove(20);
        customList.add(21);
        customList.add(22);
        customList.add(23);
        customList.add(24);
        customList.add(25);
        customList.add(26);

        System.out.println("Array size/number of elements = " + customList.getSize());
        Integer pickIndex2 = 25;
        System.out.println("Element at index " + pickIndex2 + " = " + customList.get(pickIndex2));
        System.out.println("Removed element at index: " + pickIndex2 + " and returned " + customList.remove(pickIndex2));
        System.out.println("New element at index " + pickIndex2 + " = " + customList.get(pickIndex2));
        System.out.println(customList.get(pickIndex2));

    }
}