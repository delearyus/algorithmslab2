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
        RandomGenerator RG = new RandomGenerator();
        Stopwatch S = new Stopwatch();
        
        int[] input1 = RG.randomArray(100);
        int[] input2 = RG.randomArray(1000);
        int[] input3 = RG.randomArray(10000);
        int[] input4 = RG.randomArray(100000);
        
        
//        System.out.println("Original List:");
//        printlist(nums);
//        
//        
//        System.out.println("HeapSorted:");
//        int[] hsnums = (int[]) nums.clone();
//        HS.sort(hsnums);
//        printlist(hsnums);
//        
//        System.out.println("QuickSorted:");
//        int[] qsnums = (int[]) nums.clone();
//        QS.sort(qsnums);
//        printlist(qsnums);

        System.out.println("|---------------------|");
        System.out.println("| BEGINNING BENCHMARK |");
        System.out.println("|---------------------|");
        System.out.println("");
        System.out.println("Testing time with 100");
        benchmark(input1,S,HS,QS);
        System.out.println("Testing time with 1000");
        benchmark(input2,S,HS,QS);
        System.out.println("Testing time with 10000");
        benchmark(input3,S,HS,QS);
        System.out.println("Testing time with 100000");
        benchmark(input4,S,HS,QS);
        System.out.println("Benchmark Finished.");

        
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
    
    static void benchmark(int[] nums,Stopwatch S,HeapSort HS, QuickSort QS) {
        int[] hsnums = nums.clone();
        int[] qsnums = nums.clone();
        
        System.out.print("running heapsort test.... ");
        S.start();
        HS.sort(hsnums);
        S.stop();
        System.out.printf("Done in %08d ns.%n",S.getTime());
        
        System.out.print("running quicksort test... ");
        S.start();
        QS.sort(qsnums);
        S.stop();
        System.out.printf("Done in %08d ns.%n",S.getTime());
    }
    
}
