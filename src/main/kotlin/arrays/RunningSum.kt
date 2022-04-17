package arrays

import java.util.*

fun main(){

    var array1 = intArrayOf(1,2,3,4)
    var array2 = intArrayOf(1,1,1,1,1)
    var array3 = intArrayOf(3,1,2,10,1)
    array1 = runningSum(array1)
    array2 = runningSum(array2)
    array3 = runningSum(array3)

    //check the result
    println(arrayOf(array1).contentDeepToString())
    println(arrayOf(array2).contentDeepToString())
    println(arrayOf(array3).contentDeepToString())
}


fun runningSum(nums: IntArray): IntArray {

var result = IntArray(nums.size)

    var sum = nums[0]
    result[0] = sum

    for(i in 1 until nums.size){
        sum += nums[i]
        result[i] = sum
    }

    return result
}



/*

https://leetcode.com/problems/running-sum-of-1d-array/

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
* */