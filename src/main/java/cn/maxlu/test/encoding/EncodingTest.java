package cn.maxlu.test.encoding;

import java.io.UnsupportedEncodingException;

public class EncodingTest {
    public static void main(String[] args) throws Exception {
        System.out.println("file.encoding:"+System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding:"+System.getProperty("sun.jnu.encoding"));
        encodingTest();
    }

    private static void encodingTest() throws UnsupportedEncodingException {
        String s = "我们是中国人";
        //如果使用不带参数的getBytes()肯定不会乱码的
        byte[] bytes = s.getBytes("utf-8");
        String s2 = new String(bytes);
        System.out.println(s2);
    }
}
