import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i=0;i<10;i++){
            array[i]=Math.random();
        }
        System.out.println("Рандомно заполненный массив:"+Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Отсортированный рандомно заполненный массив:"+Arrays.toString(array));

        System.out.println("Минимальный элемент в массиве: "+array[0]);

        System.out.println("Максимальный элемент в массиве: "+array[array.length-1]);

        double sumOfElementsOfArray=0;
        for (double v : array) {
            sumOfElementsOfArray+=v;
        }
        System.out.println("Среднее значение элементов в массиве: "+sumOfElementsOfArray/array.length);

    }
}
