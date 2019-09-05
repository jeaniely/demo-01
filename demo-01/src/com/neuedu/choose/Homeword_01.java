package com.neuedu.choose;

import java.util.Scanner;

public class Homeword_01 {
    public static void main(String[] args) {
        int salary;
        int support=2000;
        int childEdu=1000;
        int house=1500;
        int ontinuingEdu=400;

        Scanner scanner=new Scanner(System.in);

        System.out.println("输入工资");
        salary=scanner.nextInt();

        System.out.println("是否有60岁以上的老人（1 是，0 否）");
        int n1=scanner.nextInt();
        if(n1==1){
            System.out.println("是否是独生子女（1 是，0 否）");
            int nc=scanner.nextInt();
            if(nc==1){

            }else {
                System.out.println("兄弟姐妹人数：");
                int num=scanner.nextInt();
                System.out.println("是否是均摊：（1 是，0 否）");
                int np=scanner.nextInt();

                if(np==1){
                    support/=num;

                }else{
                    System.out.println("输入你需要赡养的费用");
                    support=scanner.nextInt();
                }


            }

        }
        System.out.println("是否有子女教育（1 是，0 否）");
        int n2=scanner.nextInt();
        if(n2!=1){
            childEdu=0;
        }

        System.out.println("是否租房贷款（1 是，0 否）");
        int n3=scanner.nextInt();
        if(n3!=1){
            house=0;
        }

        System.out.println("是否有继续教育（1 是，0 否）");
        int n4=scanner.nextInt();
        if(n4!=1){
            ontinuingEdu=0;
        }

       salary=salary-support-childEdu-house-ontinuingEdu;

        if(salary<=5000){
            System.out.println("不交税");
        }else if(salary<=8000){
            System.out.println("交税："+((salary-5000)*0.03));
        }else if(salary<=17000){
            System.out.println("交税："+((salary-8000)*0.1)+3000*0.03);
        }else if(salary<=30000){
            System.out.println("交税："+((salary-17000)*0.2+(17000-8000)*0.1+3000*0.03));
        }else if(salary<=40000){
            System.out.println("交税："+((salary-30000)*0.25+(30000-17000)*0.2+(17000-8000)*0.1+3000*0.03));
        }else if(salary<=60000){
            System.out.println("交税："+(salary-40000)*0.3+(40000-30000)*0.25+(30000-17000)*0.2+(17000-8000)*0.1+3000*0.03);
        }else if(salary<=85000){
            System.out.println("交税："+((salary-5000)*0.35));
        }else{
            System.out.println("交税："+((salary-5000)*0.45));
        }


    }
}
