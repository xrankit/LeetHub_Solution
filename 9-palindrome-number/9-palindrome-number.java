class Solution {
    public boolean isPalindrome(int x) {
        // int num =0;
        // int rem =0;
        // int nums=x;
        // while(x>0)
        // {
        //     rem = x%10;
        //     num = 10 * num +rem;
        //     x=x/10;
        // }
        // if(num == nums)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        
        if (x == 0) 
        {
			return true;
		}

		if (x < 0 || x % 10 == 0) {
			return false;
		}
		
		if (x < 10) {
			return true;
		}

		int leftTemp = x;
		int rightTemp = 0;
		
		
		while (leftTemp > rightTemp) {
		
			rightTemp = (rightTemp * 10) + (leftTemp % 10);
			
			if (rightTemp == leftTemp) {
				return true;
			}
			
			leftTemp = leftTemp / 10;

			if (rightTemp == leftTemp) {
				return true;
			}

		}
		
		return false;        
    }
}