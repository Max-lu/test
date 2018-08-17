package cn.maxlu.test.timer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("do something...");
            }
        };
        timer.schedule(task, 5000, 1000);
    }
}
