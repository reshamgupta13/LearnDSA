//Find the Element in Unsorted Array
class SearchElement {
    public int search(int arr[], int x) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
            return i;
            }
        }
            return -1;
    }
}
