class Solution {
    public boolean increasingTriplet(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int index = Arrays.binarySearch(nums, 0, count, nums[i]);
            if (index < 0) index = -index - 1;
            nums[index] = nums[i];
            if (index == count) count++;
        }
        return count >= 3;
    }
}
