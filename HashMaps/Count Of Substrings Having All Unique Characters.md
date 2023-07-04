
# Count Of Substrings Having All Unique Characters

1. You are given a string.
2. You have to find the count of valid substrings of the given string.
3. Valid substring is defined as a substring that has all unique characters.

 
#
Example 1:

Input: s = "aabcbcdbca"

Output: 24



## Code

```java
class Solution {
    public int uniqueLetterString(String s) {
        HashMap<Character,Integer> memo = new HashMap<Character,Integer> ();
        
        int answer = 0;
        int release = 0;

        for(int acquire =0; acquire< s.length();acquire++){
          Character currentChar = s.charAt(acquire);

          while (release < acquire && memo.containsKey(currentChar)){
              Character disChar = s.charAt(release);
              memo.put(disChar,memo.get(disChar) -1);
              if (memo.get(disChar) == 0)
              {
                  memo.remove(disChar);
                  release += 1;
              }

              memo.put(currentChar,1);
              answer += acquire - release + 1; 
              
          }
        }
        return answer;
    }
}

```


## Problem Link

 - [Pepcoding](https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/count-of-substrings-having-all-unique-characters-official/ojquestion)

