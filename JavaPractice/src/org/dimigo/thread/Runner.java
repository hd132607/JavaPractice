
package org.dimigo.thread;

/**
 * Created by codertimo on 2015. 11. 5..
 */

public class Runner extends Thread {
    private String name;

    public Runner() {}

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println(name + "출발");
        try
        {
            for(int distance = 100; distance>=0; distance-=10)
            {
                System.out.println(name + distance + "미터");
                Thread.sleep(100);
            }

            System.out.println(name + "골인");

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}