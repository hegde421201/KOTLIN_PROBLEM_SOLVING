package strings

fun main(){

    val s = "yqhbicoumu"
    val t = "ouiuycbmqh"
    println(isAnagram(s,t))

    val s1 = "rat"
    val s2 = "car"

    println(isAnagram(s1,s2))

}

fun isAnagram(s: String, t: String): Boolean {

    if(s.length != t.length) return false //return false if the two strings are of different lengths

    //Since we are given s and t are strings that contain only lowercase English letters, we will extract the ascii values of each character in each string
    //Then add the ascii values to find the sum. Use the ascii values to find the product.
    //for product we are use modulo 1000000007 to avoid overflow of long int

    var modulo = 1000000007

    var sum1 = 0.0 //sum of codepoints for all characters in string s
    var sum2 = 0.0 //sum of codepoints for all characters in string t

    var prod1 = 1L //product of codepoints for all characters in string s
    var prod2 = 1L //product of codepoints for all characters in string t

    val a = s.codePoints() //getting ascii values as an integer stream
    val b = t.codePoints()
    a.forEach { //getting each ascii value from the stream
        sum1+=it
        prod1 = (prod1 * it) % modulo //to avoid overflow while multiplying
    }

    //ditto for stream b
    b.forEach {
        sum2+=it
        prod2 = (prod2 * it) % modulo
    }


    if((prod1 == prod2 ) && (sum1 == sum2))
        return true

    return false
}

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/