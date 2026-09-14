class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a,b)-> {
       if(a[0]!=b[0]){   //number of soldier's count  in first row != in second row 
        return a[0]-b[0];  ///priority is given to the less no. of soldiers
       
       }
     return a[1]-b[1]; //  coutn of each soldier in each row index in both rows  is same ?
    }
        );

        for(int i=0;i<mat.length;i++){
            int count =0;
            for(int j=0; j<mat[0].length;j++){
             if(mat[i][j]==1){
                count++;
             }
            }
             pq.add(new int[]{count,i });
       
            }
       int ans[]= new int[k];
     for(int i=0 ; i <k;i++){
        int curr[]=pq.poll(); //we will be polling out highest priority pairs
        ans[i]=curr[1];//coresponding posiiton after polling out pairs from hgihest priority queue 

     }
     return ans;


        



    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna