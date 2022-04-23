package arrays

fun main(){

    var indices1 = arrayOf(intArrayOf(0,1),
                           intArrayOf(1,1))

    println(oddCells(2,3,indices1))

    var indices2 = arrayOf(intArrayOf(1,1),
        intArrayOf(0,0))

    println(oddCells(2,2,indices2))

}

fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {

    val outputArray = Array(size = m){IntArray(size = n){0} }

    for(i in indices.indices){

        val rowChange = indices[i][0]
        val colChange = indices[i][1]

        for(j in outputArray[0].indices){ //all columns but constant row
            outputArray[rowChange][j]++
        }

        for(k in outputArray.indices){
        //all rows but constant col
            outputArray[k][colChange]++
        }
    }

    var countOdd =0
    for(i in 0 until m*n){
        val row = i / n
        val col = i % n

        if(outputArray[row][col] % 2 == 1)countOdd++
    }

return countOdd
}

/*
 There is an m x n matrix that is initialized to all 0's.
 There is also a 2D array indices where each indices[i] = [ri, ci]
 represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Example 1:

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

Example 2:

Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.

* */