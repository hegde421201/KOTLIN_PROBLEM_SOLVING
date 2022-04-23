package arrays

fun main(){

var image = arrayOf(intArrayOf(1,1,0),
    intArrayOf(1,0,1),
    intArrayOf(0,0,0))

image = flipAndInvertImage(image)
println(image.contentDeepToString())


    var image2 = arrayOf(intArrayOf(1,1,0,0),
        intArrayOf(1,0,0,1),
        intArrayOf(0,1,1,1),
        intArrayOf(1,0,1,0))

    image2 = flipAndInvertImage(image2)
    println(image2.contentDeepToString())
}

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {

    //output is 2d array with row equal to size of image and col size equal to size image[0] --- initialise with -1
    var output = Array(image.size) { IntArray(image[0].size) {-1} }

    //step 1 : flip the input image rows
    for(row in image.withIndex()){
        output[row.index] = row.value.reversed().toIntArray()
    }

    for(row in output.withIndex()){
       var total = 0
      for(elem in output[row.index]){
        var invert = elem xor 1
        output[row.index][total++] = invert
      }
    }

return output
}

/*
https://leetcode.com/problems/flipping-an-image/

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
* */

