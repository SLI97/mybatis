package com.sli.ThreadTest;

public class MyRunableTest implements Runnable {
    private static Integer tickets = 100;
    Object obj = new Object();
    @Override
    public void run() {
//        while(true){
            synchronized(obj){
                System.out.println(Thread.currentThread().getName());
//                if(tickets>0){
//                    try {
//                        Thread.sleep(100);
//                        System.out.println(tickets--);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
//        }
    }

    public static void main(String[] args) {
        String str = new String("111");
        String str1 = "111";
//        System.out.println(str1 == str);
        Integer int1 = 128;
        Integer int2 = 128;
        System.out.println(int1 == int2);
        String str3= new String("456");

//        Thread.currentThread().setName("主线程");
//        System.out.println(Thread.currentThread().getName());
//        MyRunableTest myRunableTest = new MyRunableTest();
//        Thread thread1 = new Thread(myRunableTest);
//        thread1.setName("线程1");
//        Thread thread2 = new Thread(myRunableTest);
//        thread2.setName("线程2");
//        Thread thread3 = new Thread(myRunableTest);
//        thread3.setName("线程3");
//        thread1.start();
//        thread2.start();
//        thread3.start();
    }
}
