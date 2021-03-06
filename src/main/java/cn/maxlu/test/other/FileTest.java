package cn.maxlu.test.other;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("");
        File[] childFiles = file.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jar");
            }
        });

        for (File _file : childFiles) {
            System.out.println(_file);
        }
    }
}
