/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_8_1;

import java.util.ArrayList;

/**
 *
 * @author Carlos Guisao
 */
public class Graph implements ToolBox{
    
    public Graph(){
        tools = new ArrayList<>();
        
    }
    
    @Override
    public void add(Tool t){
        tools.add(t);
    }

    public void printAll(){
        for(int i = tools.size() - 1; i >= 0; i--){
            Tool t = tools.get(i);
            t.use();
        }
    }
    
    @Override
    public Tool get(String toolName){
        for(int i = tools.size() - 1; i >= 0; i--){
            Tool t = tools.get(i);
                if(toolName.equals(t.getName()))
                {
                    //System.out.print("ToolBox: " + i + " ");
                    t.use();
                    return t;
                }
        }
        System.out.println(toolName +" is not part of the ToolBox");
        return null;
    }
    
    private final ArrayList<Tool> tools;
}
