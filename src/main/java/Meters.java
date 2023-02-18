public class Meters {
    public static void main (String args []) {

        // перевод дюймов в метры, в одном метре 39.37 дюйма
        // вывести значение до 12 футов, в 12 футах 144 дюйма

        double meters;

        for(double inch = 1; inch < 145; inch ++) {
            meters = inch * 39.37;
            System.out.println(inch + " дюймам = " + meters + " метра");

            if(inch%12==0) {
                System.out.println();
            }
        }
    }
}
