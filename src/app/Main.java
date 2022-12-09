package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main{
    public static void main(String[] args) throws Exception{
        
        String fileName = args[0];
        
        System.out.printf("Processing %s\n", fileName);

        Path pathName = Path.of(fileName);
        String line;
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        Integer sum = 0;

        

        
        for(Integer i=0; i<=100; i++){
            line= br.readLine();
            if(line==null){
                break;
            }
            System.out.printf("%d: %s\n", i, line.toUpperCase());

            // Split the document into an array 
            String[] words = line.trim().split(" ");

            // Using the array get the length
            sum += words.length;
        }

        br.close();
        fr.close();

        System.out.printf("The total sum is: %d\n", sum);
    }
}