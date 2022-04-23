package arrays

fun main(){


    var mat1 = arrayOf(intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )
    println(mat1.contentDeepToString())
    mat1 = transpose(mat1)
   println(mat1.contentDeepToString())


    var mat2 = arrayOf(intArrayOf(1,2,3),
        intArrayOf(4,5,6))

    println(mat2.contentDeepToString())
    mat2 = transpose(mat2)
    println(mat2.contentDeepToString())


}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {

    val row = matrix.size
    val col = matrix[0].size

    if(row == col){
       val output = Array(size = row){IntArray(size = col)}
        for(i in 0 until row*col){

            val r = i / col
            val c = i % col

            output[r][c] = matrix[c][r]
        }
        return output
    }
      else {
        val output2 = Array(size = col){IntArray(size = row)}
        for(i in 0 until row*col){

            val r = i / row
            val c = i % row

            output2[r][c] = matrix[c][r]

        }
        return output2
      }

}

/*

 https://leetcode.com/problems/transpose-matrix/

 Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 10^5
-10^9 <= matrix[i][j] <= 10^9
* */