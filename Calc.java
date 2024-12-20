import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Calc {

    public static String calc(String  input) throws IOException {

        String[] words = input.split(" ");
        int len = words.length;
        if (len != 3)
        {
            throw new IOException("Неправильные данные для ввода");
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<String> signs = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

        boolean hasNumber = numbers.contains(Integer.parseInt(words[0]));
        boolean hasNumber1 = numbers.contains(Integer.parseInt(words[2]));
        boolean hasSign = signs.contains(words[1]);

        if (hasNumber == false || hasNumber1 == false || hasSign == false)
        {
            throw new IOException("Неправильные данные для ввода");
        }

        int outputInt = 0;
        if (words[1].equals("+")) {
            outputInt = 	Integer.parseInt(words[0]) + Integer.parseInt(words[2]);
        }

        if (words[1].equals("-")) {
            outputInt = 	Integer.parseInt(words[0]) - Integer.parseInt(words[2]);
        }

        if (words[1].equals("*")) {
            outputInt = 	Integer.parseInt(words[0]) * Integer.parseInt(words[2]);
        }

        if (words[1].equals("/")) {
            outputInt = 	Integer.parseInt(words[0]) / Integer.parseInt(words[2]);
        }

        return String.valueOf(outputInt);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  System.out.println("Введите текст: ");
        String input1 = reader.readLine();
        String result = calc(input1);
        System.out.println(result);

    }
}