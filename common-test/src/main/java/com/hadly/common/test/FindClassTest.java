package com.hadly.common.test;

import com.hadly.common.utils.ClassLocationUtils;

/**
 * Created by mi-123 on 2017/6/21.
 */
public class FindClassTest {
    public static void main(String[] args){
        Class strClazz = String.class;

        String from = ClassLocationUtils.where(strClazz);
//        from = ClassLocationUtils.where(FindClassTest.class);

        System.out.println("string from=" + from);
    }
}
