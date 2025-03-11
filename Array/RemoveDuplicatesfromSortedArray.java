class Solution {
    public int removeDuplicates(int[] nums) {
        int tmp = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[tmp]){
                tmp++;
                nums[tmp]=nums[i];
            }
        }
        return tmp+1;
    }
}
