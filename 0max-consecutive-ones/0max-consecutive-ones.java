class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        
       
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0;i < arr.length; i++){
            if (arr[i] == 1){
                currentSum +=arr[i];
            }else {
                maxSum = Math.max(currentSum,maxSum);
                currentSum = 0;
            }

        }
        maxSum = Math.max(currentSum,maxSum);

        return maxSum;
        
    }
}