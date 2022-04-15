package searching.binary

import kotlin.math.sqrt

fun main(){

println(judgeSquareSum(5))
println(judgeSquareSum(3))

}

fun judgeSquareSum(c: Int): Boolean {

    var result = false

    var startIndex = 0
    var endIndex = sqrt(c.toDouble()).toInt()

    /*
    Our approach
    1) The two numbers a and b will lie in the range [0,sqrt(c)]
    2) We have reduced the numbers in step 1 to be scanned
    3) We have taken a mutable hashset which saves a*a.
    4) We calculate c-b*b and then match it with any of the a*a value in the hashset for the equality c - b*b = a*a
    * */

    var hashSet = mutableSetOf<Long>()

    for (a in startIndex..endIndex) {

        var temp = a.toLong() * a
        hashSet.add(temp)

        if (hashSet.contains(c - temp)) {
            result = true
            break
        }
    }
    return result
}

/*
 Given a non-negative integer x, decide whether there are two integers a and b such that a*a + b*b = x

 Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false

* */