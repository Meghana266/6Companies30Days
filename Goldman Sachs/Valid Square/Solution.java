class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) 
    {
        int d12 = distance(p1, p2); 
        int d13 = distance(p1, p3); 
        int d14 = distance(p1, p4); 
        int d24 = distance(p2, p4);
        int d34 = distance(p3, p4);
        int d23 = distance(p2, p3);
        if (d12 == 0 || d13 == 0 || d14 == 0 || d23 == 0 || d24 == 0 || d34 == 0)   return false;
        if (d12 == d13 && 2 * d12 == d14 && d24 == d34) return true;
        if (d13 == d14 && 2 * d13 == d12 && d23 == d24) return true;
        if (d12 == d14 && 2 * d12 == d13 && d23 == d34) return true;
 
    return false;
    }

    public int distance(int[] p,int[] q)
    {
        return (q[0]-p[0])*(q[0]-p[0])+(q[1]-p[1])*(q[1]-p[1]);
    }
}
