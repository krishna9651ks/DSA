class Solution {
    public int[] twoSum(int[]arr, int target) {
        int st = 0;
        int end = arr.length-1;
        int [] ans = new int[2];
        while(st < end){
            int sum = arr[st] + arr[end];
            if(sum == target){
                ans[0] = st + 1;
                ans[1] = end + 1;
                
            }
            if(sum > target){
                end--;
            }else{
                st++;
            }
            
        }
        return ans; 
    }
}