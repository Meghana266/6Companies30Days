class Solution {
    public int minOperations(int[] nums, int[] numsDivide) 
    {
        Arrays.sort(numsDivide);
        Arrays.sort(nums);
        int gcd=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++)
        {
            gcd=gcd(gcd,numsDivide[i]);
        }
        if(gcd<nums[0]) return -1;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(gcd%nums[i]==0)  break;
        }
        if(i==nums.length)
            return -1;
        return i;
    }
    public int gcd(int a,int b)
    {
        if(b%a==0) return a;
        else return gcd(b%a,a);
    }
}
