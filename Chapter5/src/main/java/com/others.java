package com;

public class others {

    public static void test(){
        int a=0;
        int b=1;
        int c;
        System.out.print(0+",");
        for(int i=1;i<10;i++){
            if(i==1){
                System.out.print(1);
            }else {
                c=a+b;
                a=b;
                b=c;
                System.out.print(","+c);
            }

        }
    }

    public static  int test2(int num){

        if(num==1 || num==2){
            return 1;
        }else {
            return test2(num - 1) + test2(num - 2);
        }

    }


    public static void main(String[] args){
        System.out.println("test");
//        test();
        for(int i=1;i<10;i++){
            System.out.print(test2(i)+",");
        }
    }
}
