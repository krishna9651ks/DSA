// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int closest = nums[0] + nums[1] + nums[2];
//         for(int i=0;i<nums.length-2;i++){
//             for(int j=i+1;j<nums.length-1;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     int sum = nums[i] + nums[j] + nums[k];
//                     if( Math.abs(sum-target) < Math.abs(closest - target) ){
//                         closest = sum;
//                     }
//                 }
//             }
//         }
//         return closest;
//     }
// }  
//    RUM TIME TAKES MORE TIME THAT WHY WE USE ANOTHER METHOD

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Check whether current sum is closer
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                } 
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;  // exact match
                }
            }
        }

        return closest;
    }
}

