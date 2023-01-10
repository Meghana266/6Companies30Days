class Solution {
    public int maxRotateFunction(int[] nums) {
		  int max=0,sum=0,cur;

        for(int i=0;i<nums.length;i++){
            max+=i*nums[i];  
            sum+=nums[i];
        }
        cur=max;
        for(int i=nums.length-1;i>=0;i--){
            cur=cur+sum-nums.length*nums[i];
            if(cur>max) max=cur;
        }
        return max;
    }
}
