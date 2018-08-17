package cn.maxlu.test.shutdownhook;

public class Hook {

    private boolean keepRunning = true;

    private Thread thread;

    public boolean isKeepRunning() {
        return keepRunning;
    }

    public Hook(Thread thread) {
        this.thread = thread;
    }

    public void shutdown() {
        this.keepRunning = false;
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("shutdown thread " + thread + " fail");
            e.printStackTrace();
        }
    }
}