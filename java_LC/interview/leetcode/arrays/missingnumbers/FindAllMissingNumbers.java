package java_LC.interview.leetcode.arrays.missingnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Given an array nums containing n distinct numbers in the range [1,n] 
 * Find all missing numbers in the range [1,n]
 * Eg: [1,1,3,3] output [2,4]
 * Eg: [1,1] output [2]
 * Eg: [1,2,3,4,4,3,2,1,8] output [5,6,7,9]
 */
public class FindAllMissingNumbers {

    public static void main(String[] args) {
        int[] arr = 
        //{1,2,3,4,4,3,2,1,8};
        //{1,1,3,3};
        {1,1};
        Set<Integer> aset = new HashSet<>();
        Arrays.stream(arr).forEach(i->{
            aset.add(i);
        });
        List<Integer> missingNumbers = new ArrayList<>();
        IntStream.range(1, arr.length+1).forEach(i->{
           if(!aset.contains(i)) missingNumbers.add(i);
        });
        System.out.println(missingNumbers);
    }


}
