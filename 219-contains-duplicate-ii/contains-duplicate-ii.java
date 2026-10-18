class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Integer[] index = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            index[i] = i;
        }
        Arrays.sort(index,(a,b) -> Integer.compare(nums[a],nums[b]));
       // it sort the index with respect to nums values 1 1 2 3 and index is 0 3 1 2 

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