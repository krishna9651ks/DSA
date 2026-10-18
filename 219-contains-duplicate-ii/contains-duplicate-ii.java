class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Integer[] index = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            index[i] = i;
        }
        Arrays.sort(index,(a,b) -> Integer.compare(nums[a],nums[b]));
        

        for(int i=1;i<nums.length;i++) {
            if (nums[index[i]] == nums[index[i-1]]) {
                    if(Math.abs(index[i]-index[i-1]) <= k){
                        return true;
                    }
                }
            }
        

        return false; // no duplicates
    }
}