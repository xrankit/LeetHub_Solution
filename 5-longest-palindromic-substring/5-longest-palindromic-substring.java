class Solution {
    public String longestPalindrome(String s) {
       if (s == null || s.length() <= 1) {
        	return s;
        }
        int x = 2 * s.length() - 1;
        String str = "";
        int max = 0;
        for (int i = 0; i < x; i++) {//Check through the 2*len - 1
        	int left = i / 2;
        	int right = i / 2;
        	if (i % 2 == 1) {
        		right++;
        	}
        	//Check Palindromic
        	while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        		left--;
        		right++;
        	}
        	String temp = s.substring(left + 1, right);
        	//Track max
        	if (temp.length() > max) {
        		max = temp.length();
        		str = temp;
        	}
        }//END for
        return str;
    }
}