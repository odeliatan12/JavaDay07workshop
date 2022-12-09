package app;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main{
    public static void main(String[] args) throws Exception{
        
        String fileName = args[0];
        System.out.printf("Processing %s\n", fileName);

        String line;
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        
        Integer i = 0;
        while(i < 100){
            line= br.readLine();
            if(line==null){
                break;
            }
            System.out.printf("%d: %s\n", i, line.toUpperCase());
        }

        br.close();
        fr.close();
    }
}