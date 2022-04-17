package searching.binary

fun main(){

    var nums1 = intArrayOf(0,1,0)
    var nums2 = intArrayOf(0,2,1,0)
    var nums3 = intArrayOf(0,10,5,2)

    println(peakIndexInMountainArray(nums1))
    println(peakIndexInMountainArray(nums2))
    println(peakIndexInMountainArray(nums3))
}

fun peakIndexInMountainArray(arr: IntArray): Int {

    var start = 0
    var end = arr.size - 1

    while(start < end){

        var middle = start + (end - start) / 2

        if(arr[middle] < arr[middle + 1]) {
            start = middle + 1 //shifting the start point to the right
        }
        else
            end = middle //shifting the end point to the left
    }
    return end //return start is also okay
}

/*

https://leetcode.com/problems/peak-index-in-a-mountain-array/

 Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain,
return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].



Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1


Constraints:

3 <= arr.length <= 10^4
0 <= arr[i] <= 10^6
arr is guaranteed to be a mountain array.
* */