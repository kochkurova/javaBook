import java.util.Scanner;
public class Numb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;

        for (int i = 1; i <= 10; i ++) {
            System.out.println("Введи " + i + " трехзначное число");
            int x = in.nextInt();

            if (x > 99 & x < 999) {
                int y = (x % 100);
                int sot = (x - y) / 100;
                int z = (y % 10);
                int des = (y - z) / 10;
                int ed = y % 10;
                int sum = sot + des + ed;
                if (max < sum)
                    max = sum;
            }
            else {
                System.out.println("Пиши трехзначное!");
                i--;
            }

        }
        System.out.println(max + " самая большая сумма трех чисел");

    }
}






















