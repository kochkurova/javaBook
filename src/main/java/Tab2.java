public class Tab2 {

    public static void main (String [] args) {

        boolean a, b;


        System.out.println("a\tb\t&\t|\t^\t!");
        System.out.println("------------------------");


        byte z1, z2, z3, z4, z5, z6;

        a = b = true;

        if (a) z1 = 1; else z1 = 0;
        if (b) z2 = 1; else z2 = 0;
        if (a&b) z3 = 1; else z3 = 0;
        if (a|b) z4 =1; else z4 = 0;
        if (a^b) z5 = 1; else z5 = 0;
        if (!a) z6 = 1; else z6 = 0;

        System.out.println(z1 + "\t" + z2 + "\t" + z3 + "\t" + z4 + "\t" + z5 + "\t" + z6);

        a = true;
        b = false;

        if (a) z1 = 1; else z1 = 0;
        if (b) z2 = 1; else z2 = 0;
        if (a&b) z3 = 1; else z3 = 0;
        if (a|b) z4 =1; else z4 = 0;
        if (a^b) z5 = 1; else z5 = 0;
        if (!a) z6 = 1; else z6 = 0;

        System.out.println(z1 + "\t" + z2 + "\t" + z3 + "\t" + z4 + "\t" + z5 + "\t" + z6);

        a = false;
        b = true;

        if (a) z1 = 1; else z1 = 0;
        if (b) z2 = 1; else z2 = 0;
        if (a&b) z3 = 1; else z3 = 0;
        if (a|b) z4 =1; else z4 = 0;
        if (a^b) z5 = 1; else z5 = 0;
        if (!a) z6 = 1; else z6 = 0;

        System.out.println(z1 + "\t" + z2 + "\t" + z3 + "\t" + z4 + "\t" + z5 + "\t" + z6);

        a = b = false;

        if (a) z1 = 1; else z1 = 0;
        if (b) z2 = 1; else z2 = 0;
        if (a&b) z3 = 1; else z3 = 0;
        if (a|b) z4 =1; else z4 = 0;
        if (a^b) z5 = 1; else z5 = 0;
        if (!a) z6 = 1; else z6 = 0;

        System.out.println(z1 + "\t" + z2 + "\t" + z3 + "\t" + z4 + "\t" + z5 + "\t" + z6);



















    }



}
