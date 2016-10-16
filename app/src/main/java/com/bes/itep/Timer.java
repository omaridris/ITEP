package com.bes.itep;

/**
 * Created by adam on 10/16/16.
 */

public class Timer implements Runnable {

    private Thread thread = null;
    private int time;

    public Timer(int startTime)
    {
        time = startTime;
    }

    public void start()
    {
        thread = new Thread(this, "Timer");
        thread.start();
    }

    public void run()
    {
        if(thread == null) return;
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        while(time > 0)
        {
            finish = System.currentTimeMillis();
            if(finish - start == 1000)
            {
                start = System.currentTimeMillis();
                finish = System.currentTimeMillis();
                time--;
            }
        }
    }
}
