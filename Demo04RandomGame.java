//模拟猜数字

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//[1,100]
        Scanner sc=new Scanner(System.in);
        while (true){
           System.out.println("请输入你猜的数字：");
           int scannerNum=sc.nextInt();
           if(scannerNum>randomNum){
               System.out.println("大了，请重试！");
           }else if(scannerNum<randomNum){
               System.out.println("小了，请重试！");
           }else {
               System.out.println("猜对了！！");
               break;
           }
       }
    }
}
