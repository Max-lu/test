package cn.maxlu.test.url;

import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8888/echo/parent");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        InputStream inputStream = conn.getInputStream();
        System.out.println("conn");
    }

    private static void fileURL() throws MalformedURLException {
        File file = new File("E:\\Download\\test.bat");
        URL url = file.toURI().toURL();
        System.out.println(url);
    }
}
