package searching.linear

import kotlin.math.max

fun main(){

 var accounts1 = arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))
 var accounts2 = arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5))
 var accounts3 = arrayOf(intArrayOf(2,8,7), intArrayOf(7,3,1), intArrayOf(9,5,1))

    println(maximumWealth(accounts1))
    println(maximumWealth(accounts2))
    println(maximumWealth(accounts3))
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var maxima = 0
    for(acc in accounts){
        var wealth = 0

        for(customer in acc)
        {
            wealth += customer

            if(wealth > maxima) maxima = wealth
        }
    }
    return maxima
}

/*
 https://leetcode.com/problems/richest-customer-wealth/

 You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
i th customer has in the j th bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
* */