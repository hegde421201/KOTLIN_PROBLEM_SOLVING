package arrays

fun main(){

    var array = intArrayOf(2,3,4,7,11)
    var missingNum = findKthPositive(array,5)

    println(missingNum)

    array = intArrayOf(1,2,3,4)
    missingNum = findKthPositive(array,2)

    println(missingNum)

    array = intArrayOf(1,3,4)
    missingNum = findKthPositive(array,2)

    println(missingNum)

    array = intArrayOf(3,4,5)
    missingNum = findKthPositive(array,6)

    println(missingNum)

}

fun findKthPositive(arr: IntArray, k: Int): Int {

    val lastElement = arr[arr.size - 1]
    var missingK = 0

    for(i in 1..lastElement){
        if(!arr.contains(i))
            missingK++

        if(missingK == k){
            missingK = i
            break
        }
    }

    //this takes care of case 2 below (example 2)
    if(missingK < k){
        missingK = lastElement + (k - missingK)
    }

    return missingK
}

/*

https://leetcode.com/problems/kth-missing-positive-number/

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Example 1:
-------------
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
* */

