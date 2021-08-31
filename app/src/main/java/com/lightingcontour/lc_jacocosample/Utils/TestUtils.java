package com.lightingcontour.lc_jacocosample.Utils;

/**
 * @auther ken
 * @date 2021/8/31
 */
public class TestUtils {
    static int a = 1;
    public static void m1(){

        int b = 2;
        a ++ ;
        if(a > 2){
            m2();
        }else{
            System.out.println("哈哈哈哈");
        }
    }

    public static void m2(){
        System.out.println("m2....");
    }
}
