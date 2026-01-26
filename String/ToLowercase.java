/*
Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
 */

/*Solution */
class Solution {
    public String toLowerCase(String s) {
        char[] ch =s.toCharArray();
        for(int i=0; i<ch.length; i++)
        if('A'<= ch[i] && ch[i]<='Z')
        ch[i]=(char)(ch[i]-'A'+'a');
        return new String(ch);

    }
}
