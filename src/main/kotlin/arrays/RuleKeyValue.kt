package arrays

fun main(){

    val items = mutableListOf<List<String>>()

    items.add(listOf("phone","blue","pixel"))
    items.add(listOf("computer","silver","lenovo"))
    items.add(listOf("phone","gold","iphone"))

    val ruleValue = "silver"
    val ruleKey = "color"

    countMatches(items,ruleKey,ruleValue)


    val items1 = mutableListOf<List<String>>()

    items1.add(listOf("phone","blue","pixel"))
    items1.add(listOf("computer","silver","phone"))
    items1.add(listOf("phone","gold","iphone"))

    val ruleValue1 = "phone"
    val ruleKey1 = "type"

    countMatches(items1,ruleKey1,ruleValue1)


}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {

    var counter = 0

    when(ruleKey){

        "type" -> items.iterator().forEach { if(it[0] == ruleValue) counter++ }
        "color" -> items.iterator().forEach { if(it[1] == ruleValue) counter++ }
        "name" -> items.iterator().forEach { if(it[2] == ruleValue) counter++ }
    }

    println(counter)

    return counter
}


/*
https://leetcode.com/problems/count-items-matching-a-rule/

 You are given an array items, where each items[i] = [typei, colori, namei]
 describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == type(i).
ruleKey == "color" and ruleValue == color(i).
ruleKey == "name" and ruleValue == name(i).
Return the number of items that match the given rule.

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],
["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],
["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule,
which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.


Constraints:

1 <= items.length <= 10^4
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
* */
