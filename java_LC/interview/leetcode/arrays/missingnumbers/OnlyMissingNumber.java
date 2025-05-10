package java_LC.interview.leetcode.arrays.missingnumbers;

import java.util.stream.IntStream;

/*
 * Given an array nums containing n distinct numbers in the range [0,n] 
 * return the only number in the range that is missing from the array
 * Eg: [0,1,3] output 2
 * Eg: [1,0] output 2
 * Eg: [9,6,4,2,3,5,7,0,1]
 */
public class OnlyMissingNumber {

    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8};
        int n = array.length;
        int natural_Sum = (n*(n+1))/2;
        int array_sum=IntStream.of(array).sum();
        System.out.println("Missing number is "+(natural_Sum-array_sum));
    }
}
