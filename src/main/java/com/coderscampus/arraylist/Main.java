package com.coderscampus.arraylist;

public class Main{
    public static void main(String[] args) {

        CustomList<Integer> customList = new CustomArrayList();

        // Testing zone: //
//        System.out.println("Boolean value = " + customList.add(1));
//        System.out.println("Array size/number of elements = " + customList.getSize());
//        Integer pickIndex = 0;
//        System.out.println("Element at index " + pickIndex + " = " + customList.get(pickIndex));
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++){
            sut.add(i);
        }
        for(int i = 0; i < sut.getSize(); i++){
            System.out.println(sut.get(i));
        }
        System.out.println();
        sut.remove(9);
        sut.remove(7);
        sut.add(7, 1000);
        sut.add(2000);
        for(int i = 0; i < sut.getSize(); i++){
            System.out.println(sut.get(i));
        }
    }
}