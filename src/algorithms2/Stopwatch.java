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
public class Stopwatch {
    
    long start_time;
    long end_time;
    
    void start() {
        start_time = System.nanoTime();
    }
    
    void stop() {
        end_time = System.nanoTime();
    }
    
    long getTime() {
        return end_time - start_time;
    }
    
}
