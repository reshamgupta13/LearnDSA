class Solution {
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int count=0;
        int res=0;
        while(n>0){
            if((n&1)==1){
                count++;
               
                if(count>res){
                    res=count;
                }
            }else if((n&1)==0){
                count=0;
            }
            n>>=1;
        }
        
        return res;
        
    }
}