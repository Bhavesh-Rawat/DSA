// Problem link - https://leetcode.com/problems/target-sum/description/

// Solution using brute force -

// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         return totalways (nums,0,target);
        
//     }
//     private int totalways(int[]nums,int currentindex,int target) {
//         if(currentindex == nums.length && target == 0)
//             return 1;
//         if(currentindex == nums.length && target != 0)
//             return 0;
        
//         int ifsum = totalways (nums,currentindex +1, target - nums[currentindex]);
//         int ifnotsum = totalways (nums,currentindex +1, target + nums[currentindex]);
//         return ifsum + ifnotsum;
            
//         }
// }

// Optimized Code -
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return totalways (nums,0,target, new HashMap<String,Integer>());
        
    }
    private int totalways(int[]nums,int currentindex,int target, HashMap<String,Integer> memo) {
        if(currentindex == nums.length && target == 0)
            return 1;
        if(currentindex == nums.length && target != 0)
            return 0;
        
        String currentKey = Integer.toString(currentindex)+"-"+ Integer.toString(target);

        if (memo.containsKey(currentKey))
        return memo.get(currentKey);

        int ifsum = totalways (nums,currentindex +1, target - nums[currentindex],memo);
        int ifnotsum = totalways (nums,currentindex +1, target + nums[currentindex],memo);
        memo.put(currentKey,ifsum + ifnotsum);
            return memo.get(currentKey);
        }
}