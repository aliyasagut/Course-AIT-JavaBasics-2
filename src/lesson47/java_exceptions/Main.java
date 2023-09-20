package lesson47.java_exceptions;

import java.util.Scanner;

public class Main {
    /*
    Exceptions (Исключения)

    Ошибки наследуют класс Throwable и делятся на ошибки, возникающие в джава-машине (вне нашего контроля) и
    исключения (те, что можно обрабатывать в программе).

     */


        /*
        Типы исключений:
        1. "Встроенные" в джаву исключений и написанные программистом

        Встроенные:
        1. Checked - проверяемые на стадии компиляции
        2. Unchecked - не проверяемые на стадии компиляции

        Важные определения при работе с исключениями:
        1. try - код, который может вызвать появление исключения помещяется в блок try.
        Блок try определяет, произошло ли исключение, если да, то передает управление программой соответствующему
        блоку catch или блоку finally

        2. catch - это блок, в котором содержится код для обработки возникшего исключения.
        Блок catch выолняется только в том случае, если произошло исключение и существует в связке с блоком try

        3. finally - этот блок будет выполняться всегда независосмо от того, произошло исключение или нет.

        4. throw - используется для того, чтобы бросить исключение

        5. throws - используется в сигнатуре метода и указывает на то, что метод может бросить одно или несколько исключений


        Try-Catch block

        try {
            block of code
        } catch ( Exception e ) {
            code for exception handling
        }

        Одному блоку try может соответствовать несколько блоков catch, каждый из которых отвечает за обработку
        своего вида исключений.

        Можно также создать блок catch, который будет отлавливать все исключения.
        В этом случае он должен ловить Exception e и стоять после всех остальных блоков catch,
        ловящих отдельные исключения и относящихся к одному и тому же блоку try.
         */

    public static void main(String[] args) {
        int num1, num2;
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
 */

        int[] ints = {1, 2, 0};

        try {
//            String nullStr = null;
//            nullStr.length();
            num1 = ints[100];
            num2 = ints[2];
            int divide = num1 / num2;
            System.out.println("num1/num2 = " + divide);
            System.out.println("End of try block");
        } catch (ArithmeticException exception) {
            System.out.println("Do not divide by zero!");
            System.out.println(exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }

        System.out.println("After exception occured");


        System.out.println("--------------------------------------");
        int[] numbers = {4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int[] dividers = {2, 0, 4, 8, 0, 8};


        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + " / " + dividers[i] + " = " + numbers[i] / dividers[i]);
            }
            catch (ArithmeticException e){
                System.out.println("Can't divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Dividers array is finished and element was not found");
            }
        }

        /*
         finally block

         try {
            block of code
         }
         catch () {
            exception handling code
         }
         finally {
            код, который должен выполниться в случае случае
            }

         */
        System.out.println("-----------------------------");
        try {
            int a = 100/1;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is block finally");
        }

        System.out.println("we are out of try-catch-finally");



    }
}
