package searching.binary

fun main(){


    var nums1 = intArrayOf(5,7,7,8,8,10)
    var nums2 = intArrayOf(5,5,7,8,8,10)
    var nums3 = intArrayOf()

    nums1 = searchRange(nums1,8)
    nums2 = searchRange(nums2,6)
    nums3 = searchRange(nums3,0)

    println(nums1.toTypedArray().contentDeepToString())
    println(nums2.toTypedArray().contentDeepToString())
    println(nums3.toTypedArray().contentDeepToString())
}

fun searchRange(nums: IntArray, target: Int): IntArray {

    var answer = intArrayOf(-1,-1)

    answer[0]= binarySearch(nums,target,0,nums.size-1,true)
    answer[1]= binarySearch(nums,target,0,nums.size-1,false)

    return answer
}

fun binarySearch(nums: IntArray, target: Int,start : Int,end : Int,searchLeft : Boolean) : Int {

    var ans = -1
    var start1 = start
    var end1 = end

    while(start1 <= end1){

        var middle = start1 + (end1 - start1) / 2

        if(target < nums[middle]){
            end1 = middle - 1
        }
        else if(target > nums[middle]){
            start1 = middle + 1
        }
        else {
            ans = middle

            if(searchLeft){
                end1 = middle - 1
            }
            else{
                start1 = middle + 1
            }
        }
    }
    return ans
}


/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

 Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:
---------------------

0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
nums is a non-decreasing array.
-10^9 <= target <= 10^9

* */

