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
public class Algorithms2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] nums = {5,2,8,3,1};
        
        HeapSort HS = new HeapSort();
        QuickSort QS = new QuickSort();
        
        
        System.out.println("Original List:");
        printlist(nums);
        
        
        System.out.println("HeapSorted:");
        int[] hsnums = (int[]) nums.clone();
        HS.sort(hsnums);
        printlist(hsnums);
        
        System.out.println("QuickSorted:");
        int[] qsnums = (int[]) nums.clone();
        QS.sort(qsnums);
        printlist(qsnums);
        
    }
    
    static void printlist(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    
}
