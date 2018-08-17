package cn.maxlu.test.other;

public class Main {
    public static void main(String[] args) {
        new Main().new Child().echo();
    }

    private class Parent {
        public void echo() {
            System.out.println(this.getClass());
            System.out.println(super.getClass());
        }
    }

    private class Child extends Parent {
        public void echo() {
            System.out.println(this.getClass());
            System.out.println(super.getClass());
            super.echo();
        }
    }
}
