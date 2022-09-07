/*
键盘输入三个数字，求最大值
 */

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c=sc.nextInt();
        System.out.println("最大的数字是："+getMax(a,b,c));
    }

    public static int getMax(int a,int b,int c) {
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(a>c){
            max=a;
        }else{
            max=c;
        }
        return max;
    }
}
