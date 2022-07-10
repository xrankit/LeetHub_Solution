import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for (int a : num) 
        {
          sb.append(a);
        }
        BigInteger big = new BigInteger(sb.toString());
        BigInteger result = big.add(BigInteger.valueOf(k));
        String resultStr = result.toString();
        List<Integer> list = new ArrayList<>();
        for (char a : resultStr.toCharArray())
        {
            list.add(Integer.parseInt(String.valueOf(a)));
         }
    return list;
    }
}