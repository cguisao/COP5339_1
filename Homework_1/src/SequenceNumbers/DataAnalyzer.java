/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenceNumbers;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author carlos Guisao
 */

public class DataAnalyzer {
    private final LinkedList<Integer> list;
    
    public DataAnalyzer(LinkedList<Integer> IncomingList)
    {
        list = IncomingList;
    }
    
    public int FindMax()
    {
        Collections.sort(list);
        return list.getLast();
    }
    
    public int FindMin()
    {
        Collections.sort(list);
        return list.getFirst();
    }
    
    public short FindAverage()
    {
        short divide = 0;
        short sum = 0;
        for(short i= 0; i < list.size(); i++)
        {
            sum += list.get(i);
            divide++;
        }
        return (short) (sum/divide);
    }
}
