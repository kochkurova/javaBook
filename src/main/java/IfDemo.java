public class IfDemo {
    public static void main (String args [] ) {

        // демонстрация цикла if
        int a, b, c;
        a = 2;
        b = 3;
        c = a - b;

        // отработает
        if(a < b)
            System.out.println("a меньше b");

        // не отработает
        if(a == b)
            System.out.println("a равно b");

        // отработает
        if(c <= 0)
            System.out.println("c - отрицательное число");

        // не отработает
        if (c > 0)
            System.out.println("c - не отрицательное число");


    }
}
