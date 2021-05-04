package Homework3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        // Массив с вопросами и ответами
            String[][] testQuestions = {
                    {"Млечный путь — это…", "1. Галактика", "2. Скопление звезд", "3. Солнечная система", "4. Парад планет"},
                    {"Как можно из Евразии пешком добраться в Северную Америку?", "1. Через перешеек в Беринговом проливе", "2. По льду из Чукотки на Аляску", "3. Но новому Евро-Американскому мосту", "4. Никак"},
                    {"Царь Петр І какой по счету из рода Романовых?","1. Первый", "2. Второй", "3. Третий", "4. Четвертый"}
            };
        // Массив с номерами правильных ответов по порядку
        int[] rightAnswers = {1, 2, 4};
        int result = 0;

        for (int i = 0; i < testQuestions.length; i++) {
            for (String item : testQuestions[i]) {
                System.out.println(item);
            }
            System.out.println();
            System.out.print("Введите номер варианта ответа (от 1 до 4)\n");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            result = answer == rightAnswers[i] ? result+1 : result;
        }
        System.out.println("Правильных ответов: " + result +" из " + testQuestions.length);
    }
}

