class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count_c = 1;
        int count_r = 1;
        
         for(int j =0;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                count_r = 0;
            }
        }
        
       for(int i =0;i<m;i++)
       {
           if(matrix[i][0]==0)
           {
               count_c = 0;
           }
       }
       
        for(int i =1;i<m;i++)
        {
            for(int j =1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
         for(int j=1;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i =1;i<m;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int i =1;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j =0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
    
        
        if(count_c==0)
        {
            for(int i =0;i<m;i++)
            {
                matrix[i][0]=0;
            }
        }
        if(count_r==0)
        {
            for(int j=0;j<n;j++)
            {
                matrix[0][j]=0;
            }
        }
    }
}