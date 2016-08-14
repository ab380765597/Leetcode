public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator==0){
            return "ZeroError";
        }
        if(numerator==0){
            return "0";
        }
        String res = "";
        if((denominator<0)^(numerator<0)){
            res = res+'-';
        }
        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);
        
        long re = num/den;
        res = res+String.valueOf(re);
        
        long reminder = num%den*10;
        if(reminder==0){
            return res;
        }
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        res = res+".";
        while(reminder!=0){
            if(map.containsKey(remainder)){
                int beg = map.get(remainder);
                String part1 = res.substring(0, beg);
                String part2 = res.substring(beg, res.length());
			    res = part1 + "(" + part2 + ")";
			    return res;
            }
            
            // continue
		    map.put(remainder, res.length());
		    re = remainder / den;
		    res += String.valueOf(re);
		    remainder = (remainder % den) * 10;
        }
        
        return res;
    }
}