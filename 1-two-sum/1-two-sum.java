class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            int i2 = indexOf(nums,temp,i+1);
            if(i2 !=-1 && i != i2){
                return new int[]{i,i2};
            }
        }
        return null;
    }

    private int indexOf(int[] nums, int target, int start) {
        for(int i = start; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}