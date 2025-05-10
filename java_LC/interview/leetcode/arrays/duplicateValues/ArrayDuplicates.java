package java_LC.interview.leetcode.arrays.duplicateValues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/* 
  Given an array, return true if their exisits number twice in array. 
  Eg: [1,2,3,2,4] return true
  Eg: [1,2,3,4,5] return false
 */
public class ArrayDuplicates {

    

    public static void main(String[] args) {
        int []array = {1,2,3,5,4,6,5,3};
        System.out.println("By Count method "+byCountMethod(array));
        System.out.println("By loops method "+byLoops(array));
        System.out.println("By Set method "+bySetMethod(array));
    }

    private static Boolean bySetMethod(int[] array) {
        boolean found = false;
        Set<Integer> a = new HashSet<>();
        IntStream.of(array).forEach(a::add);
        found = a.size()==array.length;
        return !found;
    }

    private static Boolean byLoops(int[] a) {
        boolean found = false;
        label: 
        for(int i=0;i<a.length;i++){
            int j=a.length-1;
            while(j>i){
                if(a[i]==a[j]){
                    found=true;
                    break label;
                }
                else j--;
            }
        }
        return found;
    }

    private static Boolean byCountMethod(int[] a) {
        boolean found = false;
        long count = Arrays.stream(a).distinct().count();
        found = count==a.length;
        return !found;
    }


}
