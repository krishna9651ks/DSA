class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int overlap = 0;
        int w = Math.min(ax2,bx2) - Math.max(ax1,bx1);
        int h = Math.min(ay2,by2) - Math.max(ay1,by1);

        if(w>0 && h>0){
            overlap = w*h;
        }
        int ans = area1 + area2 - overlap;
        return ans;
    }
}