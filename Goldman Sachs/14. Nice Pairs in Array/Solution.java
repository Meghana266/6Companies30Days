class Solution {
    public int countNicePairs(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for (int i=0;i<nums.length;i++) 
        {
            int key = nums[i] - reverseInt(nums[i]);
            if (map.containsKey(key)) 
                ans += map.get(key);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ans %= 1000000007;
        return (int)ans;
    }

    public int reverseInt(int n) 
    {
        int res=0;
        while(n!=0)
        {
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
}
