//Random类用来生成随机数字

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        System.out.println("随机数是；"+num);
    }
}
