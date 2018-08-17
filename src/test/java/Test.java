import java.net.URLEncoder;

public class Test {
    public static void main(String[] args) throws Exception{
        String a = URLEncoder.encode("环境地址", "UTF-8");
        System.out.println(a);


        String b = URLEncoder.encode(a, "UTF-8");
        System.out.println(b);
    }
}
