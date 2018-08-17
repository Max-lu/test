package cn.maxlu.test.shutdownhook;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        LoopService loopService = new LoopService();
        loopService.startService();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
