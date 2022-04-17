package searching.binary

fun main(){


    var nums1 = intArrayOf(1,3,5,6)
    var nums2 = intArrayOf(1,3,5,6)
    var nums3 = intArrayOf(1,3,5,6)

    println(searchInsert(nums1,5))
    println(searchInsert(nums2,2))
    println(searchInsert(nums3,7))

}

fun searchInsert(nums: IntArray, target: Int): Int {

    var start = 0
    var end = nums.size - 1

    if(target > nums[nums.size - 1])
    {
        return nums.size
    }

    while(start <= end){

        var middle = start + (end - start) / 2

        if(target < nums[middle]){
            end = middle - 1
        }
        else if(target > nums[middle]){
            start = middle + 1
        }
        else
            return middle
    }
    return start
}


/*
 https://leetcode.com/problems/search-insert-position/

 Given a sorted array of distinct integers and a target value,
 return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums contains distinct values sorted in ascending order.
-10^4 <= target <= 10^4

* */

