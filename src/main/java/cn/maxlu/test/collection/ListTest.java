package cn.maxlu.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        List<String> list2 = Collections.unmodifiableList(list);
        list2.add("ddd");
    }
}
