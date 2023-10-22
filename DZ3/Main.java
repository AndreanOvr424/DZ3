package P1;

//ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
// Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
// Вывести результат действия. Используйте конструкции if -else, case.

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Введите первое число : ");
          int a = scanner.nextInt();

          System.out.print("Введите второе число : ");
          int b = scanner.nextInt();

          System.out.print("Введите число от 1 до 4, где 1 = +, 2 = -, 3= *, 4 = /");
          int c = scanner.nextInt();

          if(c==1) {
              System.out.println("Сумма:" + (a + b));

          }else if (c==2) {
              System.out.println(" Разность:" + (a - b));

          }else if (c==3) {
              System.out.println("Произведение:" + (a * b));
          }else if (c==4) {
              System.out.println("Частное:" + ((double) a / b));
          }



              scanner.close();




      }
}