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
class SumThread extends Thread {
  public SumThread(int from, int to) {
    this.from = from;
    this.to = to;
    sum = 0;
  }

  @Override
  public void run( ) {
    for(int i = from; i <= to; i++) {
      sum += i;
    } 
  }

  public int getSum( ) {
    return sum;
  }

  private int from, to, sum;
}