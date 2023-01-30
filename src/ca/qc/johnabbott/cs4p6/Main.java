package ca.qc.johnabbott.cs4p6;

import java.io.*;
import java.util.Scanner;

public class
Main {

    public static void main(String[] args) throws IOException {
        solve("./data/sample0.txt","./data/out.txt");
    }

    public static void solve(String inFileName, String outFileName) throws IOException {
        try
        {
            Scanner scan = new Scanner(new FileReader(inFileName));
            PrintWriter pw = new PrintWriter( new FileWriter(outFileName));


                String line = scan.nextLine();
                System.out.println(line);
                for (int i = 0; i<Integer.valueOf(line);i++){
                    String newLine = scan.nextLine();
                    System.out.println(newLine);
                }


        }
        catch (IOException e){
            throw  new IOException( e.getMessage());
        }
    }

}
