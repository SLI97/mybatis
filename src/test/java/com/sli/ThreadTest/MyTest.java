package com.sli.ThreadTest;

public class MyTest extends Thread{
    private static Integer tickets = 100;
    @Override
    public void run() {
        while(true){
            if(tickets>0){
                try {
                    Thread.sleep(100);
                    System.out.println(tickets--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.start();
    }
}
