package arrays

fun main(){

    var arr1 = intArrayOf(4,5,8)
    var arr2 = intArrayOf(10,9,1,8)

   println( findTheDistanceValue(arr1,arr2,2))

    var arr3 = intArrayOf(1,4,2,3)
    var arr4 = intArrayOf(-4,-3,6,10,20,30)

    println( findTheDistanceValue(arr3,arr4,3))

    var arr5 = intArrayOf(2,1,100,3)
    var arr6 = intArrayOf(-5,-2,10,-3,7)

    println( findTheDistanceValue(arr5,arr6,6))

}

fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {

    var counter = arr1.size

for(i in arr1.indices){
    for(j in arr2.indices){
        var dist = arr1[i] - arr2[j]
        if(dist < 0) dist *= -1

        if(dist  in 0..d){
            counter--
            break
        }
    }
}
return counter
}

/*
 Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i]
such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.



Example 1:

Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
Output: 2
Explanation:
For arr1[0]=4 we have:
|4-10|=6 > d=2
|4-9|=5 > d=2
|4-1|=3 > d=2
|4-8|=4 > d=2
For arr1[1]=5 we have:
|5-10|=5 > d=2
|5-9|=4 > d=2
|5-1|=4 > d=2
|5-8|=3 > d=2
For arr1[2]=8 we have:
|8-10|=2 <= d=2
|8-9|=1 <= d=2
|8-1|=7 > d=2
|8-8|=0 <= d=2
Example 2:

Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
Output: 2
Example 3:

Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
Output: 1
* */
