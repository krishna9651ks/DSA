class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start=0;
        int end = rows * cols -1;
        while(start <= end){
            int mid = (start+end)/2;
            int row = mid / cols; // it conver imagenery 1D from actual 2D
            int col = mid % cols; // important
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}

// it is for o(n+m) complexity
        //  int row = 0;
        // int col = matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==target){
        //         //System.out.println("Found at ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(matrix[row][col]>target){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // //System.out.println("target not found");
        // return false;


    