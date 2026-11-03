class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left = 0;
    int count = 0;
    boolean [] arr = new boolean[128];
    for(int right = 0; right < s.length() ; right++){
        while(arr[s.charAt(right)]){
            arr[s.charAt(left)] = false;
            left++ ;

        }
        arr[s.charAt(right)] = true;
        count = Math.max(count, right-left+1);

    }
    return count;
    
        
    }
}