public class Tab {

    public static void main (String [] args) {

        boolean a, b;


        System.out.println("a\t\tb\t\t&\t\t|\t\t^\t\t!");
        System.out.println("-------------------------------------------");
        a = b = true;
        System.out.println(a + "\t" + b + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a));
        a = true;
        b = false;
        System.out.print(a + "\t" + b + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a) + "\n");
        a = false;
        b = true;
        System.out.print(a + "\t" + b + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a) + "\n");
        a = b = false;
        System.out.println(a + "\t" + b + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a));



















    }
}
