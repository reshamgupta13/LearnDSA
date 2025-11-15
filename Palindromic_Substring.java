class Solution {
    public int countSubstrings(String s) {
        int totalcount=0;
        for(int i=0; i<s.length(); i++){
                    int j=i;
                    int odd=expend(s,i,j);
                     j=i+1;
                    int even=expend(s,i,j);
                    totalcount=totalcount+odd+even;
        }
        return totalcount;
    }
    int expend(String s, int i, int j){
        int Count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            Count++;
            i--;
            j++;
        }
        return Count;
    }
}