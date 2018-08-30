package com.example; 
 
public class Hello implements HelloMBean { 

    private static final int DEFAULT_CACHE_SIZE = 200; 

    private final String name = "Reginald"; 
    private int cacheSize = DEFAULT_CACHE_SIZE; 
	
    public void sayHello() { 
        System.out.println("hello, world"); 
    } 
     
    public int add(int x, int y) { 
        return x + y; 
    } 
     
    public String getName() { 
        return this.name; 
    }  
     
    public int getCacheSize() { 
        return this.cacheSize; 
    } 
     
    public synchronized void setCacheSize(int size) {
        this.cacheSize = size; 
        System.out.println("Cache size now " + this.cacheSize); 
    } 
     
}