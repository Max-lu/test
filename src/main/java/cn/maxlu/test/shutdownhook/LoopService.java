package cn.maxlu.test.shutdownhook;

public class LoopService implements Runnable {

    private Hook hook;

    private HookRegister hookRegister;

    public LoopService() {
        this.hookRegister = new HookRegister();
    }

    public void startService() {
        Thread thread = new Thread(this);
        this.hook = hookRegister.register(thread);
        thread.start();
    }

    @Override
    public void run() {
        while (hook.isKeepRunning()) {
            System.out.println("loop");
        }
        System.out.println("loop end");
    }
}
