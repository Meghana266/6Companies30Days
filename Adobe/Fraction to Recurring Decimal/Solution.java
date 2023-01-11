class Solution {
   public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        String result = new String();
        if ((numerator < 0) ^ (denominator < 0)) result+="-";
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        long quotient = num / den;
        long remainder = num % den * 10; 
        result+=String.valueOf(quotient); 
        if (remainder == 0) return result;
        result+=".";
        Map<Long,Integer> ref = new HashMap<>(); 
 
        while (remainder != 0) 
        {
            if (ref.containsKey(remainder)) 
            {
                int index = ref.get(remainder);
                String part1 = result.substring(0, index);
                String part2 = "("+ result.substring(index, result.length())+ ")";
                return part1 + part2;
            }
            ref.put(remainder, result.length());
            quotient = remainder / den;
            result=result.concat(String.valueOf(quotient)); 
            remainder = (remainder % denominator) * 10;
        }
        return result;
    }
}
