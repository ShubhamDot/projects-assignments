class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum =0;
        int[] k = new int[2];
        for(int i = 1; i< nums.length;i++){
            for(int j =0 ; j< i;j++){
               sum =  nums[j] + nums[i];  
                if(sum == target){
                    k[0] = j;
                    k[1] = i;
                    break;
                }
            }
        }
    return k;
    }
}