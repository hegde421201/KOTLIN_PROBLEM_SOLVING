package searching.linear

fun main(){

var array = intArrayOf(12,345,3,5,6789)

    println(findNumbers(array))

}

fun findNumbers(nums: IntArray): Int {

    var count = 0
    for(num in nums)
        if(evenDigits(countDigits(num))) count++

    return count
}

//if modulus returns zero then even number is true
fun evenDigits(totDigits : Int):Boolean = (totDigits % 2 == 0)

//count digits in the number
fun countDigits(number:Int) : Int{

    var totDigits = 0
    var temp = number

    if(number < 0)
        temp *= -1

    while (temp > 0){
        totDigits++
        temp /= 10 //remove final digit from the number
    }
    return  totDigits
}

/*

https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.

* */