/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenceNumbers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author carlos Guisao
 */


public class main {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter integers please: ");
        Scanner cin = new Scanner(System.in);
        String in = cin.nextLine();
        
        System.out.println("Enter the File Name:");
        String fileName = cin.nextLine() + ".txt";
        String[] nums = in.split(" ");
        // get the numbers from the screen
        
        LinkedList<Integer> list = new LinkedList();
        
        for (String num : nums) {
            try {
                list.add(Integer.parseInt(num));
            }catch (NumberFormatException ex)
            {
                throw new Exception("Let's try again, just integers this time.");
            }
        }
        
        DataAnalyzer data = new DataAnalyzer(list);
        int Max = (Integer)data.FindMax();
        int Min = (Integer)data.FindMin();
        short Ave = (Short)data.FindAverage();
        
        System.out.println("Max Number: " + Max);
        System.out.println("Min Number: " + Min);
        System.out.println("Ave Number: " + Ave);
        
        // Save it into a file now
        
        BufferedWriter writer = null;
        FileWriter fileWriter = null;
        
        try
        {
            fileWriter = new FileWriter(fileName);
            writer = new BufferedWriter(fileWriter);
            System.out.println("Finished!");
        }catch (IOException ex)
        {
        }
        finally
        {
            try
            {
                if(writer != null)
                {
                    writer.close();;
                }
                if(fileWriter != null)
                {
                    fileWriter.close();
                }
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}