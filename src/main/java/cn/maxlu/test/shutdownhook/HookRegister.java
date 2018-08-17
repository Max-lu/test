package cn.maxlu.test.shutdownhook;

import java.util.ArrayList;
import java.util.List;

public class HookRegister {

    private final List<Hook> hooks;

    public HookRegister() {
        this.hooks = new ArrayList<>();
        createShutdownHook();
    }

    private void createShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new ShutdownDaemonHook());
    }

    public Hook register(Thread thread) {
        thread.setDaemon(true);
        Hook hook = new Hook(thread);
        hooks.add(hook);
        return hook;
    }

    private class ShutdownDaemonHook extends Thread {
        @Override
        public void run() {
            for (Hook hook : hooks) {
                hook.shutdown();
            }
        }
    }
}
