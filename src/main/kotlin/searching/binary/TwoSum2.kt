package searching.binary

fun main(){

    var array1 = intArrayOf(2,7,11,15)
    var array2 = intArrayOf(2,3,4)
    var array3 = intArrayOf(-1,0)

    array1 = twoSum(array1,9)
    array2 = twoSum(array2,6)
    array3 = twoSum(array3,-1)

     println(array1.toTypedArray().contentDeepToString())
     println(array2.toTypedArray().contentDeepToString())
     println(array3.toTypedArray().contentDeepToString())

}



fun twoSum(numbers: IntArray, target: Int): IntArray {

   var startIndex = 0
   var endIndex = numbers.size - 1
   var answer = IntArray(size = 2){-1}

    while(startIndex < endIndex){

        val sum = numbers[startIndex] + numbers[endIndex]

        if(target == sum){
            answer = intArrayOf(startIndex + 1,endIndex + 1)
            break
        }
        else if(target > sum){
           startIndex++
        }
        else if(target < sum)
        {
            endIndex--
        }
    }

    return answer
}

/*

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

 Given a 1-indexed array of integers numbers
 that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
 Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 10^4
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
* */