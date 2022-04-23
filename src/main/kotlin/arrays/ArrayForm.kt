package arrays

import kotlin.math.pow

fun main(){

    val arr1 = intArrayOf(1,2,0,0)
    val arr2 = intArrayOf(2,7,4)
    val arr3 = intArrayOf(2,1,5)

    println(addToArrayForm(arr1,34).toTypedArray().contentDeepToString())
    println(addToArrayForm(arr2,181).toTypedArray().contentDeepToString())
    println(addToArrayForm(arr3,806).toTypedArray().contentDeepToString())
}


fun addToArrayForm(num: IntArray, k: Int): List<Int> {

    var result = mutableListOf<Int>()

    val length = num.size
    var counter = 0
    var actualNum = 0L
    for(i in length-1 downTo 0){
        var partialNum = 10.0.pow(counter++) *num[i]
        actualNum += partialNum.toLong()
    }

    var resultNumber = actualNum + k

    while (resultNumber > 0){

        val rem = resultNumber % 10
        result.add(rem.toInt())
        resultNumber /= 10
    }

    return result.reversed()
}

/*

https://leetcode.com/problems/add-to-array-form-of-integer/

 The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021


Constraints:

1 <= num.length <= 10^4
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 10^4
* */