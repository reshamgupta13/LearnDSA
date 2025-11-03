class Solution {
    public void reverseArray(int arr[]) {
    
        int slow=0, high=arr.length-1;
        while(slow<high){
            int temp = arr[slow];
            arr[slow]=arr[high];
            arr[high]=temp;
            slow++;
            high--;
        }
    }
}