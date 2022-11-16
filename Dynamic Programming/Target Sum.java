// Solution using brute force -

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return totalways (nums,0,target);
        
    }
    private int totalways(int[]nums,int currentindex,int target) {
        if(currentindex == nums.length && target == 0)
            return 1;
        if(currentindex == nums.length && target != 0)
            return 0;
        
        int ifsum = totalways (nums,currentindex +1, target - nums[currentindex]);
        int ifnotsum = totalways (nums,currentindex +1, target + nums[currentindex]);
        return ifsum + ifnotsum;
            
        }
}