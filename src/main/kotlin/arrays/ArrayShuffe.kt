package arrays

fun main(){

    var array1 = intArrayOf(2,5,1,3,4,7)
    var array2 = intArrayOf(1,2,3,4,4,3,2,1)
    var array3 = intArrayOf(1,1,2,2)

    array1 = shuffle(array1,array1.size/2)
    array2 = shuffle(array2,array2.size/2)
    array3 = shuffle(array3,array3.size/2)

    println(arrayOf(array1).contentDeepToString())
    println(arrayOf(array2).contentDeepToString())
    println(arrayOf(array3).contentDeepToString())

}

fun shuffle(nums: IntArray, n: Int): IntArray {

    var result = IntArray(2 * n)

    //The first and last elements remain unchanged
    var firstHalf = 0 //first half of the array begins with 0 till n-1
    var secondHalf = n //second half of the array begins at n till the last index 2*n-1

    var index = 0 //start index
    while(firstHalf < n){
       result[index++] = nums[firstHalf++]
       result[index++] = nums[secondHalf++]
       //index increments by 2
    }

    return result
}

//2,5,1,3,4,7
//2,3,5,4,1,7

// i i+1 i+2 ||  i+3 i+4 i+5

/*

https://leetcode.com/problems/shuffle-the-array/


Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]


Constraints:
--------------
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
* */
