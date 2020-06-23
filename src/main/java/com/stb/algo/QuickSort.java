package com.stb.algo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = new int[]{3,4,1,2,5};
        quickSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void quickSort(int[] array){
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array,int left,int right){
        if( left >= right){
            return;
        }
        int pivot = array[(left+right)/2];
        int index = partition(array,left,right,pivot);
        System.out.println(pivot+" : "+index);
        sort(array,left,index-1);
        sort(array,index,right);
    }

    private static int partition(int[] array,int left,int right,int pivot){
        while (left <= right){
            while (array[left] < pivot){
                left++;
            }
            while (array[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
