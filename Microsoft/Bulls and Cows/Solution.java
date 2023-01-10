class Solution 
{
    public String getHint(String secret, String guess) 
    {
        String output;
		    int[] count=new int[10];
		    int cow=0,bull=0;
        for(int i=0;i<secret.length();i++)
        {
          count[secret.charAt(i)-'0']++;
          if(secret.charAt(i)==guess.charAt(i))
            bull++;
        }
        for(int i=0;i<secret.length();i++)
        {
          if(count[guess.charAt(i)-'0']!=0)
          {
            count[guess.charAt(i)-'0']--;
            cow++;
          }
        }
        cow=cow-bull;
        output=String.format(bull+"A"+cow+"B");
        return output;
    }
}
