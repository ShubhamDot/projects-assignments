class Solution {
    public boolean containsDuplicate(int[] nums) { 
        if(nums.length <= 1)
            return false;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < nums.length ; i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }

        return false;
    }
}

