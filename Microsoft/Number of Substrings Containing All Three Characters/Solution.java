class Solution {
    public int numberOfSubstrings(String s) 
    {
        int ans = 0 , i = 0;
        int abc[] = new int[3];
        for (int j = 0; j < s.length(); ++j) 
        {
                ++abc[s.charAt(j) - 'a'];
                while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0)
                    --abc[s.charAt(i++) - 'a'];
                ans += i;
        }
        return ans;
    }
}
