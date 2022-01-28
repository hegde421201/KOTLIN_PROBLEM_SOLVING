package arrays

fun main(){

    val array = intArrayOf(2,7,11,15)
    twoSum(array,9)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val targetArray = intArrayOf(0,0)

    if(nums.isEmpty()) return targetArray

    val hashMap = mutableMapOf<Int,Int>()

    for(i in nums.indices)
    {

        if(hashMap.containsKey(nums[i]))
        {
            targetArray[0] = hashMap[nums[i]]?:0
            targetArray[1] = i

            return targetArray
        }

        hashMap[target - nums[i]] = i

    }
    return targetArray
}

/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
* */