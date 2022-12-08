import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];

        Random random = new Random();
        int max = -20;
        int min = 20;
        for (int i =0; i< array.length; i++) {
            array[i]= (int) random.nextInt(-20,20);
            System.out.println(array[i]);
            if (array[i]>max) max=array[i];
            if (array[i]<min) min=array[i];
        }

        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}