class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        if(nums.length>=3){ 
            for(int i = nums.length-1;i>=2 ; i--){
                if(nums[i-2] + nums[i-1] > nums[i]){
                    ans = nums[i-2] + nums[i-1] + nums[i];
                    return ans;
                }
                
            }
            
        }
        return ans;
    }
}