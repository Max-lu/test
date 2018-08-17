package cn.maxlu.test.other;

public class RefObjectTest {
    public static void main(String[] args) {
        RefObject<String> refObject = new RefObject<>();
        String out = get(refObject);
        System.out.println(out);
        System.out.println(refObject.getValue());
    }

    private static String get(RefObject<String> refObject) {
        refObject.setValue("hello refObject");
        return "hello world";
    }

    private static class RefObject<T> {
        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
