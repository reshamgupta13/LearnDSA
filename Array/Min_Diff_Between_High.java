/*
Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
 */

class Solution {
    static public int minimumDifference(int[] nums, int k) {
        final int n=nums.length;
        if (k==1) return 0;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int l=0, r=k-1; r<n; ){
            diff=Math.min(diff, nums[r++]-nums[l++]);
        }
        return diff;
    }
}