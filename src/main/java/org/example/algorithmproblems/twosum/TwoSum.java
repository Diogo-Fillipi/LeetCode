package org.example.algorithmproblems.twosum;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length ; i++){
            for(int j = i + 1; j <= nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                    int[] res = {i, j};
                    return res;
                }
            }
        }
        return new int[1];
    }
}
