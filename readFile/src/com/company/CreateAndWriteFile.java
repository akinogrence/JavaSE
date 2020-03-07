package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFile {

    public static void main(String[] args) {


        File file = new File("/Users/akinogrence/Documents/IdeaProjects/readFile/File.txt");

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("this line one");
            bw.newLine();
                bw.write("this line two");
            }
            catch (IOException E){E.printStackTrace();}

    }
}
