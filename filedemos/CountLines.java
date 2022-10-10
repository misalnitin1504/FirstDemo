package com.prominentpixel.filedemos;

import java.io.*;

public class CountLines {
    public static void main(String[] args)
            throws IOException
    {
    File file = new File("E:\\MyDirectory\\Test.txt");
    FileInputStream fileInputStream = new FileInputStream(file);
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String line,myline;
    int l=0;
    int wordCount = 0;
    int characterCount = 0;
    int paraCount = 0;
    int whiteSpaceCount = 0;
    int sentenceCount = 0;

        while ((myline=bufferedReader.readLine())!=null){
            if((myline.equals("\n"))){
                l++;
            }
        }
        while ((line = bufferedReader.readLine()) != null) {

        if (line.equals("")) {
            paraCount += 1;
        }
        else {
            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;
            whiteSpaceCount += wordCount - 1;
            String sentence[] = line.split("[!?.:]+");
            sentenceCount += sentence.length;
        }
    }
        if (sentenceCount >= 1) {
        paraCount++;
    }
        System.out.println("Lines = "+ l);
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);

}
}

