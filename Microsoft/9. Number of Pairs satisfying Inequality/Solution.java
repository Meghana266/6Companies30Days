class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int n= nums2.length;
        List<Integer> difference = new ArrayList<>(n);
        long result = 0;
        for(int i=0;i<n;i++)
        {
            int current=nums1[i]-nums2[i];
            result+=(long)binarySearch(difference,current+diff);
            difference.add(binarySearch(difference,current),current);
        }
        return result;
    }

    public int binarySearch(List<Integer> difference, int count)
    {
        int l=0,r=difference.size();
            while(l<r)
            {
                int m=l+(r-l)/2;
                if(difference.get(m)<=count)
                    l=m+1;
                else
                    r=m;
            }
            return l;
    }
}
