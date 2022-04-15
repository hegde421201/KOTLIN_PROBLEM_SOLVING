package searching.binary

fun main(){

    println(isPerfectSquare(9))
    println(isPerfectSquare(19))
    println(isPerfectSquare(16))
}




fun isPerfectSquare(num: Int): Boolean {

    if(num <=0)
        return false

    if(num == 1)
        return true

    var result = false

    var startIndex = 1
    var endIndex = num/2 //square root cannot be greater than one-half of the number

    while(startIndex <= endIndex){

        val middle = (startIndex + endIndex) / 2

        //to avoid overflow for large integers we are converting to LONG
        val squaredNum = middle.toLong() * middle

        if(squaredNum == num.toLong())
        {
            result = true
            break
        }

        else if(squaredNum < num.toLong())
        {
            startIndex = middle + 1
        }
        else if(squaredNum > num.toLong()){
            endIndex = middle - 1
        }
    }

return result
}




/*

Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false

* */