class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){// using XOR operation
            ans = ans ^ nums[i];
        }
        return ans;
    }
}