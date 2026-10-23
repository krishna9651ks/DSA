// class Solution {
//     public int hammingWeight(int n) {
//         int count =0;
//         while(n>0){
//             if((n&1)!=0){
//                 count ++;
//             }
//             n = n>>1;

//         }
//         return count;
//     }
// }

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n = n & (n-1);
            count ++;
        }
        return count;
    }
}