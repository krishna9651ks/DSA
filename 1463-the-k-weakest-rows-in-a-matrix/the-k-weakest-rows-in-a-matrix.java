class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int soldier [] = new int [n];
        
        for(int i=0;i<n;i++){
            int counting = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    counting++;

                }
            }
            soldier[i] = counting;
        }
            
        Integer[] rows = new Integer[n];
        for(int i=0 ; i<n ; i++){
            rows[i] = i;
        }
        Arrays.sort(rows, (a, b) -> {
            if (soldier[a] == soldier[b]) {
                return a - b;
            }
            return soldier[a] - soldier[b];
        });

        int ans [] = new int [k];
        for(int i=0;i<k;i++){
            ans[i] = rows[i];
        }
        return ans;

        
       


    }
}
