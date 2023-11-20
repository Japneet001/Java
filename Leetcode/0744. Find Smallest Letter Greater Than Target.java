/* You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = 'a';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                result = letters[i];
                break;
            } else {
                result = letters[0];
            }
        }
        return result;
    }
}