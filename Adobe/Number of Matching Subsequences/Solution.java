class Solution {
        public int numMatchingSubseq(String s, String[] words) {
            int count=0;
            HashMap<String,Integer> ref = new HashMap();
            for(int i=0;i<words.length;i++)
            {
                int k=0,j=0;
                String word=words[i];
                if(!ref.containsKey(word))
                {
                    while(j < word.length() && k < s.length()) 
                    {
                        if(word.charAt(j) == s.charAt(k)) 
                        {
                            j++;
                            k++;
                        } 
                        else 
                            k++;
                    }
                    if(j >= word.length()) 
                    {
                        ref.put(word, 1);
                        count++;
                    } 
                    else 
                        ref.put(word, 0);
                }
                else if(ref.get(word)!=0)
                        count++;
            }
            return count;
        }
    }
