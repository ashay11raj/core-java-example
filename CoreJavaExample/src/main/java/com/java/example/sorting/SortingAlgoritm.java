package com.java.example.sorting;

import java.util.Arrays;

public class SortingAlgoritm {
    //static int [] intArray = {34, 12, 54, 22, 78, 1, 21, 9, 65, 87, 11, 49};
    static int [] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    //static int [] intArray = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        int len = intArray.length;
        printArray("Original Array: ", intArray);
        //bubbleSort(intArray, len);
        //selectionSort(intArray, len);
        insertionSort(intArray, len);

    }

    private static void printArray(String msg, int[] intArray) {
        System.out.print(msg);
        Arrays.stream(intArray).forEach(i -> System.out.print("\t" + i));
        System.out.println("\n");
    }

    private static void insertionSort(int[] intArray, int len) {
        for(int i=0; i<len-1; i++){
            int tempIndex = i+1;
            //int tempValue = intArray[tempIndex];
            while(tempIndex>0){
                if(intArray[tempIndex] < intArray[tempIndex-1]){
                    swap(intArray, tempIndex, tempIndex-1);
                    tempIndex -= 1;
                }
            }
            printArray("insertionSort iteration "+ (i+1) +": ", intArray);
        }
        printArray("insertionSort Array: ", intArray);
    }

    private static void bubbleSort(int[] intArray, int len) {
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(intArray[j] > intArray[j+1]) swap(intArray, j, j+1);
            }
            printArray("bubbleSort iteration "+ (i+1) +": ", intArray);
        }
        printArray("bubbleSort Array: ", intArray);
    }

    private static void selectionSort(int[] intArray, int len) {
        for(int j=0; j<len; j++){
            int tempIndex = j;
            for(int i=j+1; i<len; i++){
                if(intArray[tempIndex] > intArray[i]){
                    tempIndex = i;
                }
            }
            if(tempIndex>j) swap(intArray, j, tempIndex);
            printArray("selectionSort iteration "+ (j+1) +": ", intArray);
        }
        printArray("selectionSort Array: ", intArray);
    }

    private static void swap(int[] intArray, int i, int j) {
        intArray[i] = intArray[i] * intArray[j];
        intArray[j] = intArray[i] / intArray[j];
        intArray[i] = intArray[i] / intArray[j];
    }
}
