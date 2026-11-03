class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean [] arr =  new boolean[128];
        int left = 0;
        int max = 0;
         for(int i = 0;i<s.length();i++){
            while(arr[s.charAt(i)]){
                arr[s.charAt(left)] = false;
                left++;
            }
            arr[s.charAt(i)]  = true;
            max = Math.max(max , i - left + 1);

         }
        return max;
        

        
    }
}