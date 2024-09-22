import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String testString = "abcdefghijklmnopqrstuvwxyz"; // тестовая строка.

        int divisionsAmount; // количество разделений строки.
        int sizeOfBlock;
        int currentIndex;
        String partOfString;

        Random random = new Random();
        divisionsAmount = random.nextInt(1, testString.length() - 1); // так как в д.з. не сказано сколько раз делить, назначаем рандомно. Максимальное количество разделений на единицу меньше, чем число символов в строке.
        sizeOfBlock = testString.length() / divisionsAmount; // В соответствии с домашним заданием определяем размер частей произвольно, например разделим строку на произвольные равные части.

        System.out.println("Количество делений: " + divisionsAmount);

        if (testString.isEmpty() || testString.contains(" ") || testString.length() == 1) {
            System.out.println("Для разделения строка не должна быть пустой, не должна содержать пробелы, а также должна содержать минимум 2 символа.");
        } else if (testString.length() == 2) {
            System.out.println("Строку " + testString + " можно разделить только пополам: " + testString.charAt(0) + " " + testString.charAt(1));
        } else {


            //System.out.println("Размер части: " + sizeOfBlock);
            //System.out.println("Остаток: " + testString.length() % divisionsAmount);

            currentIndex = 0;

            for (int i = 1; i <= divisionsAmount; i++) {
                partOfString = testString.substring(currentIndex, sizeOfBlock * i);
                //System.out.println("Текущий индекс: " + currentIndex + ", конечный индекс: " + sizeOfBlock * i);
                System.out.println(i + "-я часть: " + partOfString);
                currentIndex = sizeOfBlock * i;
            }

            if (testString.length() % divisionsAmount != 0) {   //Если остаток от деления не 0, то выводим оставшиеся символы.
                System.out.println("Последняя часть: " + testString.substring(testString.length() - testString.length() % divisionsAmount));
            }
        }
    }
}