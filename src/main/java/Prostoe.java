public class Prostoe {

    public static void main (String [] args) {

        for (int i = 3; i <= 100; i ++) {
            int del = 0;
            for (int j = 2; j < i; j ++) {
                if (i % j == 0)
                    del++;
            }
            if (del == 0)
              System.out.println(i + " простое число");
        }
    }
}
