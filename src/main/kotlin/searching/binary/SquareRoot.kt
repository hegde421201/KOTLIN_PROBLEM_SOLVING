package searching.binary

fun main(){
    println(mySqrt(Int.MAX_VALUE))
    println(mySqrt(16))
    println(mySqrt(49))
    println(mySqrt(6))
    println(mySqrt(9))
}

fun mySqrt(x: Int): Int {

    //base cases ---- negative numbers are not entertained
    if(x <=1)
        return x

    var result = 1

    var startIndex = 1
    var endIndex = x/2 //square root of x cannot be more than x/2

    while(startIndex <= endIndex){

        val middle = ( startIndex + endIndex ) / 2

        //to avoid overflow for large integers we are converting to LONG
        val squaredNum = middle * middle.toLong()

        if(squaredNum == x.toLong())
            return middle

        if(squaredNum < x.toLong()){
            startIndex = middle + 1
            result = middle
        }
        else {
            endIndex = middle - 1
        }
    }
    return result
}

/*
 Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:

Input: x = 4
Output: 2

Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

 */


