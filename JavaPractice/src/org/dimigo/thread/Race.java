package org.dimigo.thread;

/**
 * Created by codertimo on 2015. 11. 5..
 */
public class Race {

    public static void main(String[] args) {

        System.out.println("main thread start");

        Thread t1 = new Runner("김준성");
        Thread t2 = new Runner("강희룡");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}
