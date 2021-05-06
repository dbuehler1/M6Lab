package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public abstract class SingletonClass {
    private static List strings = new ArrayList();
    public void enqueue(String str){
        strings.add(str);
    }

    public void flush(){

    }

}
