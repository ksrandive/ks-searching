package com.ks.learning.binarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] intArray = {12, 22, -15, 2, 21, 15, -22};
        Arrays.sort(intArray);

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(intArray,21));
        System.out.println(binarySearch.search(intArray, -2));
    }
}
