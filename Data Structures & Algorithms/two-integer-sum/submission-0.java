class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = {0, 0};
        for (int k = 0; k < nums.length; k++){
            for (int i = k+1; i <nums.length; i++)
            if (nums[i] + nums[k] == target){
                solution[0] = k;
                solution[1] = i;
            }
        }
        return solution;
    }
}
