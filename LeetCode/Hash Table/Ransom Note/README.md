# 383. Ransom Note

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/ransom-note/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 
OriginalJavaExample 1:
Input:String ransomNote = "a";String magazine = "b";Output: false
Example 2:
Input:String ransomNote = "aa";String magazine = "ab";Output: false
Example 3:
Input:String ransomNote = "aa";String magazine = "aab";Output: true

 
Constraints:


	1 <= ransomNote.length, magazine.length <= 105
	ransomNote and magazine consist of lowercase English letters.

## Examples

```
Input:String ransomNote = "a";String magazine = "b";Output: false

Input:String ransomNote = "aa";String magazine = "ab";Output: false

Input:String ransomNote = "aa";String magazine = "aab";Output: true
```

## Constraints

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*