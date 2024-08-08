package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Привет! Это консольное приложение для конвертации значения температуры " +
                "по шкале Цельсия в значение по шкале Фаренгейта либо Кельвина");
        while (true){
        System.out.println("--------------------------------------------------");
        System.out.println("Введите значение температуры по Цельсию " +
                "(при вводе нецелочисленного значения используйте в качестве разделителя запятую): ");

        Scanner scanner=new Scanner(System.in);
        double degreesInCelsiusFromUser=scanner.nextDouble();

        System.out.println("Введите предпочитаемую шкалу в которую значение будет конвертировано " +
                "(F - по Фаренгейту; K - по Кельвину): ");
        String scale=scanner.next();
        System.out.println("--------------------------------------------------");

        if (!(scale.equals("F")||scale.equals("K"))){
            System.out.println("Данные введены некорректно, попробуйте еще раз!");
        } else if (scale.equals("F")) {
            System.out.println("Температура по Фаренгейту: "+BaseConverter.convert(degreesInCelsiusFromUser,scale));
        } else if (scale.equals("K")) {
            System.out.println("Температура по Кельвину: "+BaseConverter.convert(degreesInCelsiusFromUser,scale));
        }
            System.out.println();

        System.out.println("Продолжить конвертацию? Если да введите - Y, если нет - N");
        String answer=scanner.next();
        if (!(answer.equals("Y")||answer.equals("N"))){
            System.out.println("Данные введены некорректно, попробуйте еще раз!");
            break;
        } else if (answer.equals("N")) {
            break;
        }
       }
    }
}
