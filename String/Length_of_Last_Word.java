/*Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4. */

/*Solution */

class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
         s=s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
               break;
            }
            count++;
        }
        return count;
    }
}