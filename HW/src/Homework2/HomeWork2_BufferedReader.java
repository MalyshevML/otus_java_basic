package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class HomeWork2_BufferedReader {

    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter you full name");
            String fullName = reader.readLine();
            String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
            System.out.println("Program result: " + encodedFullName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}