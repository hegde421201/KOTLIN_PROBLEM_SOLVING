package searching.binary

fun main(){

    //The problem question can be found here
    // https://leetcode.com/problems/search-a-2d-matrix/

    /*
     Write an efficient algorithm that searches for a value target in an m x n integer matrix.
      This matrix has the following properties:
         ---- Integers in each row are sorted from left to right.
         ---- The first integer of each row is greater than the last integer of the previous row.

    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    Output: true

    Input: matrix = [[1,3,5,7]], target = 34
    Output: false
     */


    val arr1 = arrayOf(intArrayOf(1,2,8))
    val arr2 = arrayOf(intArrayOf(1,2,3,7),intArrayOf(10,11,16,20),intArrayOf(23,30,34,60))

    println( searchMatrix(arr1,2))
    println( searchMatrix(arr2,35))

}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

    var row = 0 //starting row index
    var col = matrix[0].size - 1 //final column index

    while(row < matrix.size && col >=0){

        if(matrix[row][col] == target)
            return true

        if(matrix[row][col] > target){
         // matrix element greater than target element --- reduce the column index by 1 thereby eliminating search space further
          col--
        }else {
            //matrix element less than target element --- reduce the row index by 1 thereby eliminating search space further
            row++
        }
    }

    return false
}