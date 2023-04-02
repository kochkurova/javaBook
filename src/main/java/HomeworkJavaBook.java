public class HomeworkJavaBook {
    public static void main (String [] args) throws java.io.IOException {

        char symbol;
        int space = 0, Aa = 0, aA = 0;

        for (; ;) {

                System.out.println("Введите любой символ с клавиатуры");
                System.out.println("Для завершения введи точку");
                do {
                    symbol = (char) System.in.read();
                    if (symbol > 64 & symbol < 91) {
                        symbol += 32;
                        System.out.println(symbol);
                        Aa ++;
                    }
                    else if (symbol > 96 & symbol < 123) {
                        symbol -= 32;
                        System.out.println(symbol);
                        aA ++;
                    }
                    if (symbol == ' ') space++;
                } while (symbol != '.');
                System.out.println("количество пробелов: " + space + '\n' + "Преобразование в маленькие " + Aa + '\n' +
                        "Преобразование в большие " + aA);
            break;
        }
    }
}
