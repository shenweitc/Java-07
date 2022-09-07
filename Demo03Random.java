//根据int变量n的值，获取随机数，范围是【1，n】

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int num=sc.nextInt();
        Random r=new Random();

        for (int i = 0; i < 50; i++) {
            int result=r.nextInt(num)+1;
            System.out.println(result);
        }
    }
}
