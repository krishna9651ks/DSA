class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int div = 0;
            while(num > 0){
                int rem = num%10;
                num=num/10;
                div = div+rem;
            }
            num = div;
            

        }
        return num;
       
    }
}