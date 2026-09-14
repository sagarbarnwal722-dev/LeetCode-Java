class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        return (long)rec1[0] < rec2[2] &&
               (long)rec2[0] < rec1[2] &&
               (long)rec1[1] < rec2[3] &&
               (long)rec2[1] < rec1[3];
    }
}