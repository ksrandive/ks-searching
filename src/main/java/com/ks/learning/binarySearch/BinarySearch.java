package com.ks.learning.binarySearch;

public class BinarySearch {

    public int search(int[] inputArray, int number){
        int start = 0;
        int end = inputArray.length;

        while (start < end){
            int mid = (start + end) / 2;
            if(number == inputArray[mid]){
                System.out.println("Element is found on position "+ mid);
                return number;
            }else if(inputArray[mid] < number){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
