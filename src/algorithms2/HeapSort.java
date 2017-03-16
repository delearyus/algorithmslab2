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
class HeapSort {
    
    void sort(int[] nums) {
        build_heap(nums);
        int temp;
        int heap_size = nums.length;
        for (int i = nums.length - 1; i > 0; i--) {
            //System.out.print("before: ");
            //Algorithms2.printlist(nums);
            temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heap_size--;
            max_heapify(nums,0,heap_size);
            //System.out.print("after: ");
            //Algorithms2.printlist(nums);
        }
    }
    
    void build_heap(int[] nums) {
        int midpoint = (int) Math.floor(nums.length / 2);
        
        for (int i = midpoint; i >= 0; i--) {
            max_heapify(nums, i,nums.length);
        }
    }

    void max_heapify(int[] nums, int i,int n) {
        int parent = i;
        int left_child = i * 2 + 1;
        int right_child = i * 2 + 2;
        int temp = nums[parent];
        int largest = parent;
        
        if (left_child < n && nums[left_child] > nums[largest]) {
            largest = left_child;
        }
        
        if (right_child < n && nums[right_child] > nums[largest]) {
            largest = right_child;
        }
        
        if (largest != parent) {
            nums[parent] = nums[largest];
            nums[largest] = temp;
            max_heapify(nums,largest,n);
        }
        
        
    }
    
}
