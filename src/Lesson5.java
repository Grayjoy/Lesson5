import java.util.Arrays;
import java.util.Scanner;



public class Lesson5 {

    Scanner scanner = new Scanner(System.in);

    public void logic() {

        // 1. Найти минимальное значение из массива

        int [] cats = new int [11];
      for (int i = 0; i < cats.length ; i++) {
           cats[i] = (int) (Math.random() * 10);
       }
      System.out.println(Arrays.toString(cats));
      int min = cats[0];
        for (int i = 0; i <cats.length ; ++i) {
              if (cats[i] < min)
                  min = cats[i];
        }
        System.out.println("Минимальное число: " + min);

        //2. Переставить элементы массива в обратном порядке
        int[] arrayCats = new int[cats.length];
        int count = cats.length - 1 ;
        for (int i = 0; i < cats.length ; i++) {
            arrayCats[i] = cats[count];
            count--;

        }
        System.out.println("Обратный порядок: " + Arrays.toString(arrayCats));

        //3.Напишите программу, которая принимает входные данные...

        System.out.println("Укажите слово");
        String scr = scanner.nextLine();

        String reverse = "";
        int length = scr.length();
        for (int i = length - 1; i >=0 ; i--) {
            reverse = reverse + scr.charAt(i);

        }
        if (scr.equals(reverse)){
            System.out.println("Это палиндром");
        }
        else {
            System.out.println("Это не полиндром");
        }

    }

}



