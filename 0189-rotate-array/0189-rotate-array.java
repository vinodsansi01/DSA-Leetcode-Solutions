class Solution {
    public void rotate(int[] nums, int k) {


         if (nums == null || nums.length == 0) return; 
        k = k % nums.length;  
        if (k == 0) return;  

        int n = nums.length;
 
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
 
        for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

         
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
        
    }
}