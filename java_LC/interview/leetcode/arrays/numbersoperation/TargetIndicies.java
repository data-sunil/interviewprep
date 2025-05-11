package java_LC.interview.leetcode.arrays.numbersoperation;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Eg: nums = [2,11,7,15], target = 9, output [0,2]
 * Eg: nums = [3,2,4], target = 6, output [1,2]
 */
public class TargetIndicies {

    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target = 9;
        loopMethods(nums, target);
        mapMethod(nums,target);
    }

    private static void mapMethod(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            var rem = target-nums[i];
            if(indexMap.containsKey(rem)){
                output[0]=i;
                output[1]=indexMap.get(rem);
                break;
            }
            else {
                indexMap.put(nums[i],i);
            }
        }
        System.out.println("Map method result = "+output[0]+" "+output[1]);
    }

    private static void loopMethods(int[] nums, int target) {
        int[] output = new int[2];
        loop:for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    break loop;
                }
            }
        }
        System.out.println("loop method result = "+output[0]+" "+output[1]);
    }
}
