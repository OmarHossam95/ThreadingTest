package com.company;

public class PrintNumbers extends Thread {
    int start;
    int end;

    public PrintNumbers(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
