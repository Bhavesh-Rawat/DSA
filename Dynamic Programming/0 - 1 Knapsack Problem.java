
// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1


// class Solution 
// { 
//     //Function to return max value that can be put in knapsack of capacity W.
//     public int knapSack(int capacity, int wt[], int val[], int n) 
//     { 
//       return maxProfit(wt, val, 0, capacity, n);
//     } 
//     private int maxProfit (int[] weight, int[] profit, int currentItem,int capacity,int n) 
//     {
//         if(currentItem == n)
//         return 0;
        
//         int currentItemWeight = weight[currentItem];
//         int currentItemProfit = profit[currentItem];
//         int consider = 0;
        
//         if(currentItemWeight <= capacity)
//         consider = currentItemProfit + maxProfit(weight,profit,currentItem+1,capacity,n);
        
//         int notConsider = maxProfit(weight,profit,currentItem+1,capacity,n);
        
//         return Math.max(consider,notConsider);
//     }
// }