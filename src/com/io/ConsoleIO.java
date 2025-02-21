package com.io;

import java.io.*;
import java.util.Scanner;

public class ConsoleIO {

    public static void readByReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("OUTPUT_PATH: " + System.getenv("myDir/output.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myDir/output.txt"));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String input = bufferedReader.readLine();

        bufferedWriter.write(input);
        bufferedWriter.newLine();;
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void readByScanner(){
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        int i = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println(d);
        System.out.println(i);
        System.out.println(str);
    }

    public static void main(String[] args){
        try{
            //ConsoleIO.readByReader();
            ConsoleIO.readByScanner();
        }catch (Exception e){
            System.out.println("Exception: " + e.toString());
        }
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
//        System.out.println(value);
    }
}
