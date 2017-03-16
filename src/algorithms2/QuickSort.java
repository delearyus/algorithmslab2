/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms2;

/**
 *
 * @author jamie
 */
class QuickSort {
    
    void sort(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
    
    void quicksort(int[] nums, int p, int r) {
        if (p < r) {
            int q = partition(nums,p,r);
            quicksort(nums,p,q-1);
            quicksort(nums,q+1,r);
        }
    }
    
    int partition(int[] nums, int p, int r) {
        int x = nums[r];
        int i = p-1;
        int temp;
        for (int j = p; j < r; j++) {
            if (nums[j] <= x) {
                i++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        temp = nums[i+1];
        nums[i+1] = nums[r];
        nums[r] = temp;
        return i+1;
    }
    
}
