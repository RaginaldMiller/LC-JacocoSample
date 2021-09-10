package com.lightingcontour.lc_jacocosample.Utils;

/**
 * @auther ken
 * @date 2021/9/9
 */
public class TestCoverageMethod {


    public static void method1(){
        int a = 1;
        int b = 2;
        int x = 0;
        int y = 1000;
        int c = a>b?a:b;
        System.out.println(c);
        if(a > 3){
            method2("aaa",x,true);
        }
        System.out.println(x);
        System.out.println(y);
    }
    public static void method2(String a,int x,boolean isTrue){

        System.out.println("method2");
        System.out.println(a);
        System.out.println(x);
        System.out.println(isTrue);

    }
}
