package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class PrintQueue {
    private static List <String> strs = new ArrayList <String>();
    public void enqueue(String str){
        strs.add(str);
    }

    public static String flush(){
        String returnStr = "";
        for(int i = 0; i < strs.size(); i++){
            returnStr = returnStr + strs.get(i) + "\n";
        }
        return returnStr;
    }
    
    
}
