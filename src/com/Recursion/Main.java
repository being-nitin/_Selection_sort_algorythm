package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Algorithm for selection sort:
        int[] nums = {7,9,5,8,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void selection(int[] nums){
        int start =0;
        for(int i=0;i<nums.length;i++){
            int last = nums.length-i-1;
            int max = maxIndex(nums,start,last);
            swap(nums,max,last) ;
        }
    }
    public static int  maxIndex(int[] nums ,int first, int last){
        int max = first;
        for(int i=first;i<=last;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[]nums, int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
// Steps to follow while concluding the algorithm:
/*
1. find the index of the element which is the maximum in the array
2. swap it with the last index.
3. repeat till last index come to the first index
 */
