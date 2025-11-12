class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
         ArrayList<Integer> l = new ArrayList<Integer>();
        int m=0;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=m){
                l.add(arr[i]);
                m=arr[i];
            }
        }
        Collections.reverse(l);
        return l;
    }
}
