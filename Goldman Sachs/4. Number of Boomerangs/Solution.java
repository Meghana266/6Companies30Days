class Solution
{
    public long distance(int a[],int b[])
    {
        return (long)(a[0]-b[0])*(long)(a[0]-b[0])+(long)(a[1]-b[1])*(long)(a[1]-b[1]);
    }

    public int numberOfBoomerangs(int[][] arr)
    {
        int result=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            Map<Long,Integer> hs=new HashMap<>();
            for(int j=0;j<n;j++)
            {
                Long distance=distance(arr[i],arr[j]);
                hs.put(distance,hs.getOrDefault(distance,0)+1);
            }
            for(int m:hs.values())
                result+=m*(m-1);
        }
        return result;
    }
}
