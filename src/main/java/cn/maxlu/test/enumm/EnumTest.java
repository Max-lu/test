package cn.maxlu.test.enumm;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Type[] enumConstants = Type.class.getEnumConstants();
        System.out.println(Arrays.toString(enumConstants));

        Type[] values = Type.values();
        System.out.println(Arrays.toString(values));
    }

    private static enum Type {
        type1, type2;
    }
}
