import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {

    Scanner scanner = new Scanner(System.in);

    public void logic() {

        // 1. Найти минимальное значение из массива

        int [] cats = new int [11];
      for (int i = 0; i < cats.length ; i++) {
           cats[i] = i;
       }
      System.out.println(Arrays.toString(cats));
      int min = cats[0];
        for (int i = 0; i <cats.length ; ++i) {
              if (cats[i] < min)
                  min = cats[i];
        }
        System.out.println("Минимальное число: " + min);

        //2. Переставить элементы массива в обратном порядке

        int count = cats.length - 1;
        for (int i = 0; i < cats.length; i++) {
            cats[i] = count;
            count--;
        }
        System.out.println("Обратный порядок: " + Arrays.toString(cats));

        //3.Напишите программу, которая принимает входные данные...

        System.out.println("Укажите слово");
        String scr = scanner.nextLine();

        char[] array = scr.toCharArray();
        char[] array1 = new char[array.length];
        int count1 = 1;

        for (int i = 0; i < array.length; i++) {
           array1[i] = array[array.length - count1];
           count1++;
        }

        String str = new String(array1);

        if (scr.equals(str)){
            System.out.println("Это палиндром");
        }
        else {
            System.out.println("Это не полиндром");
        }

    }

}



