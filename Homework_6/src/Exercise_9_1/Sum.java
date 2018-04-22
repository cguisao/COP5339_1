/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_9_1;

/**
 *
 * @author Carlos Guisao
 */
public class Sum {
    public static void main(String[] args) {
        
        sum(4, 1, 3000);
    }
    
    public static void sum(int num_threads, int from, int to){
        
        SumThread [] threads = new SumThread[num_threads];

        int step = (to - from) / num_threads;
        
        for(int i = 0; i < num_threads; i++) {
            int start = from + step * i;
            int stop = (start + step) - 1;
            if(i == (num_threads - 1)) {
                  stop = to;         
            }

              System.out.printf("Thread %d sums from %d to %d.\n", i+1, start, stop);
              threads[i] = new SumThread(start, stop);
        }

        for(int i = 0; i < num_threads; i++) {
            threads[i].start( );
        }

        try {
            for(int i = 0; i < num_threads; i++) {
                  threads[i].join( );
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }

        int total_sum = 0;
        for(int i = 0; i < num_threads; i++) {
            total_sum += threads[i].getSum( );
        }
      
        System.out.printf("The sum of %d-%d is %d.\n", from, to, total_sum);
    }
}
