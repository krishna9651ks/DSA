class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0){
        //     return false;
        // }
        // while(n%3==0){
        //     n = n/3;
        // }
        // if(n!=1){
        //     return false;
        // }
        // return true;

        return n > 0 && 1162261467 % n ==0; // power of 3^19 = 1162261467
    }
}