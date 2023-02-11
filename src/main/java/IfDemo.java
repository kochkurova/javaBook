public class IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;
        c = a - b;
        // zapystitsa
        if(a < 3) System.out.println("a men'she trech");
        if(a != b) System.out.println("a ne ravno b");
        // ne zapustitsa
        //if(a=b) System.out.println("a ravno b");

        System.out.println("c - otritsatel'noe chislo");
        if(c >= 0) System.out.println("c - ne otritsalel'noe chislo");
        if(c < 0) System.out.println("c - otritsatel'noe chislo");
    }
}
