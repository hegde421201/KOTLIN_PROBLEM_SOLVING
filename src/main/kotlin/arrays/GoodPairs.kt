package arrays

fun main(){

var nums1 = intArrayOf(1,2,3,1,1,3)
    var nums2 = intArrayOf(1,1,1,1)
    var nums3 = intArrayOf(1,2,3)

    println(numIdenticalPairs(nums1))
    println(numIdenticalPairs(nums2))
    println(numIdenticalPairs(nums3))
}

fun numIdenticalPairs(nums: IntArray): Int {

    var counter = 0
    for(i in 0..nums.size - 2){
        for(j in (i+1) until nums.size){
            if(nums[i] == nums[j])counter++
        }
    }

    return counter
}

/*

https://leetcode.com/problems/number-of-good-pairs/


 Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
* */