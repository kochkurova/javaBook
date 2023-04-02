public class GalToLitTable {
    public static void main (String args []){
        double gallons;
        double liters;
        int counter;
        counter = 0;
        for(gallons = 1; gallons < 20; gallons ++) {
            // преобразование в литры
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует " + liters + " литра");

            long intlong = 99999999999999999L;

            counter ++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
