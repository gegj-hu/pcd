package com.zj.pc;

import java.util.HashSet;  

/**  
* 已访问url队列  
* @author HHZ  
*  主要是保存已访问过的URL，使用HashSet来保存，主要是考虑到每个访问过的URL是不同。HashSet刚好符合这个要求
*/
public class VisitedUrlQueue  
{  
    public static HashSet<String> visitedUrlQueue = new HashSet<String>();  
    
    public synchronized static void addElem(String url)  
    {  
        visitedUrlQueue.add(url);  
    }  
    
    public synchronized static boolean isContains(String url)  
    {  
        return visitedUrlQueue.contains(url);  
    }  
    
    public synchronized static int size()  
    {  
        return visitedUrlQueue.size();  
    }  
}