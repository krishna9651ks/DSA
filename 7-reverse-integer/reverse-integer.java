class Solution {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        while(x!=0){
            rev = x%10;
            x = x/10;
            if(rem>Integer.MAX_VALUE/10 || rem == Integer.MAX_VALUE/10 && rev > 7){
                return 0;
            }
             if(rem<Integer.MIN_VALUE/10 || rem == Integer.MIN_VALUE/10 && rev < -8){
                return 0;
            }
            rem = (rem*10)+rev;
            
        }
        return rem;
        
    }
}