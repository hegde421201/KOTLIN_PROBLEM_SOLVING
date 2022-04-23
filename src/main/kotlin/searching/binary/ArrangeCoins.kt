package searching.binary

import kotlin.math.*


fun main(){

    println( arrangeCoins(1804289383))
    println( arrangeCoins2(1804289383))


    //  println( arrangeCoins(8))
 //   println( arrangeCoins(1))

  //  println(sqrt(8.0*1804289383+ 1))
}

fun arrangeCoins(n: Int): Int {

    var answer = (-1+  sqrt(1+8.0*n))/2
    answer = floor(answer)

    return answer.toInt()
}

fun arrangeCoins2(n: Int): Int {

    var low = 1
    var high = n
    var result = 0

    while(low <= high){
        val middle =  low + (-low + high)/2

        val coins = middle.toLong() * (middle.toLong() + 1)/2

        if(coins > n){
            high = middle - 1
        }
        else if(coins <= n){
            low = middle + 1
            result = max(middle,result)
        }
    }

    return result
}


/*
 https://leetcode.com/problems/arranging-coins/

 You have n coins and you want to build a staircase with these coins.
 The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

Constraints:
---------------
1 <= n <= 2^31 - 1

* */