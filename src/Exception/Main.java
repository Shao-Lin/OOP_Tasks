package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyIOException, MyArithmeticException, IOException {
        checkedAndUncheckedException();
        throwException();
        tryCatchException();
        handlingMultipleExceptions();
    }

    public static void checkedAndUncheckedException() throws MyArithmeticException, MyIOException {
        int a = 3;
        int b = 0;
        if (b == 0) throw new MyArithmeticException("деление на 0");    // реализация непроверяемого исключения
        int c = a / b;


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num != 13) throw new MyIOException("ошибка ввода числа"); // реализация проверяемого исключения
    }

    public static void throwException() {
        int a = -1;
        if (a < 0) throw new NegativeArraySizeException("отрицательный размер массива");  // выбрасывание исключения
        int[] arr1 = new int[a];
    }

    public static void tryCatchException() throws IOException {
        int[] arr2 = new int[3];
        try {
            System.out.println(arr2[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("обращение к несуществующему элементу массива");
            // try-catch
        }


        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();                            // try-catch-finally
        }


        try {
            fileInputStream = new FileInputStream(" ");
        } finally {                                              //try-finally
            fileInputStream.close();
        }
    }

    public static void handlingMultipleExceptions() {
        try {
            eat();
        } catch (IOException e) {                          // 1 способ
            System.out.println("PunkNotDead");
        } catch (ParseException e) {
            System.out.println("PunkDead");
        }

        try {
            eat();
        } catch (IOException | ParseException e) {        // multicatch
            System.out.println("aa");
        }


    }

    public static void eat() throws IOException, ParseException {

    }

}