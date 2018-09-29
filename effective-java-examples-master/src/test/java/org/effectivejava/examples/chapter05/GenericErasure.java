
package org.effectivejava.examples.chapter05;


import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * @author zhangmengc
 * @date 2018/9/29 15:32
 * @since v1.0.0
 */
public class GenericErasure {


    /**
     * 测试类型擦除
     */
    @Test
    public void testGeneric() {
        List l1 = new ArrayList();
        List<Integer> l2 = new ArrayList<>();
        List<? extends Number> l3 = new ArrayList<>();
        List<? super Integer> l4 = new ArrayList<>();
        List<?> l5 = new ArrayList<>();
        List<Object> l6 = new ArrayList<>();
        System.out.println(l1.getClass());
        System.out.println(l2.getClass());
        System.out.println(l3.getClass());
        System.out.println(l4.getClass());
        System.out.println(l5.getClass());
        System.out.println(l6.getClass());
    }

    @Test
    public void testParamType() {
        // 通过定义一个匿名内部类的方式来获得泛型信息
        Map<String, Integer> map = new HashMap<String, Integer>(){};

        Type type = map.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        for (Type typeArgument : parameterizedType.getActualTypeArguments()) {
            System.out.println(typeArgument.getTypeName());
        }

        List<Integer> l1 = new ArrayList<Integer>(){};
        Type type1 = l1.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType1 = ParameterizedType.class.cast(type1);
        for (Type typeArgument : parameterizedType1.getActualTypeArguments()) {
            System.out.println(typeArgument.getTypeName());
        }

        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println(Arrays.toString(l2.getClass().getTypeParameters()));

        Map<String, Integer> map2 = new HashMap<>();
        System.out.println(Arrays.toString(map2.getClass().getTypeParameters()));
    }

    public <T> T add(T x,T y){
        return y;
    }

    private static class Test2{
        //这是一个简单的泛型方法
        public static <T> T add(T x,T y){
            return y;
        }
    }

    @Test
    public void testAdd() {
        /**不指定泛型的时候*/
        int i=Test2.add(1, 2); //这两个参数都是Integer，所以T为Integer类型
        Number f=Test2.add(1, 1.2);//这两个参数一个是Integer，一个是Float，所以取同一父类的最小级，为Number
        Object o=Test2.add(1, "asd");//这两个参数一个是Integer，一个是String，所以取同一父类的最小级，为Object

        /**指定泛型的时候*/
        int a=Test2.<Integer>add(1, 2);//指定了Integer，所以只能为Integer类型或者其子类
        // int b=Test2.<Integer>add(1, 2.2);//编译错误，指定了Integer，不能为Float
        Number c=Test2.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float
    }

}
