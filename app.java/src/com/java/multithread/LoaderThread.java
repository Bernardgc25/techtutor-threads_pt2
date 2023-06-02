package com.java.multithread;
import listLoader.ListLoader;

public class LoaderThread implements Runnable {
    int startNumber, lastNumber;

    public LoaderThread(int startNumber, int lastNumber){
        this.startNumber = startNumber; 
        this.lastNumber = lastNumber; 
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
        ListLoader l = new ListLoader();
        l.loadlist(startNumber, lastNumber);

    } 
}
