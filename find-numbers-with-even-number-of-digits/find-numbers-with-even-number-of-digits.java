class Solution {
    public int findNumbers(int[] nums) {
        
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            int count2 = 0;
            while(nums[i] > 0){
                count2++;
                nums[i] /=10;
                
            }
            if(count2 % 2 == 0){
                count1++;
            }
        }
        
        return count1;
        
    }
}