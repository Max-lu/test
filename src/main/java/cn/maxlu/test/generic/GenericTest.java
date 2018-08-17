package cn.maxlu.test.generic;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GenericTest {
    private Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws Exception {

        Field filed = GenericTest.class.getDeclaredField("map");
        Type genericType = filed.getGenericType();
//        for (Type genericInterface : genericInterfaces) {
//            if (genericInterface instanceof ParameterizedType) {
//                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
//                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
//                System.out.println("genericType:" + genericInterface);
//                System.out.println("genericArguments:");
//                for (Type actualTypeArgument : actualTypeArguments) {
//                    System.out.println(actualTypeArgument);
//                }
//            }
//        }

    }
}
