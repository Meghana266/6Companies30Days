class Solution
{
    public List<String> invalidTransactions(String[] transactions)
    {
        Map<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String ts : transactions) 
        {
            String[] Info = ts.split(",");
            List<String> allTrans = map.getOrDefault(Info[0], new ArrayList<>());
            allTrans.add(ts);
            map.put(Info[0], allTrans);
        }

        for (String ts : transactions)
        {
            String[] Info = ts.split(",");
            if (Integer.parseInt(Info[2]) > 1000)
            {
                result.add(ts);
            }
            else
            {
                for (String trans : map.get(Info[0]))
                {
                    if (Math.abs(Integer.parseInt(trans.split(",")[1]) - Integer.parseInt(Info[1])) <= 60 && !trans.split(",")[3].equals(Info[3])) 
                    {
                        result.add(ts);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
