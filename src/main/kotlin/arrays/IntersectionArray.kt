package arrays

fun main(){

    var arr1 = intArrayOf(1,2,2,1)
    var arr2 = intArrayOf(2,2)
    var arr3 = intArrayOf(4,9,5)
    var arr4 = intArrayOf(9,4,9,8,4)

    arr1 = intersection(arr1,arr2)
    println(arr1.contentToString())

    arr1 = intersection(arr3,arr4)
    println(arr1.contentToString())
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val intersect = mutableListOf<Int>()

    for(i in nums1.indices){
        if(nums2.contains(nums1[i]) && !intersect.contains(nums1[i])){
            intersect.add(nums1[i])
        }
    }

    return intersect.toIntArray()
}

/*

https://leetcode.com/problems/intersection-of-two-arrays/

 Given two integer arrays nums1 and nums2,
 return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
* */