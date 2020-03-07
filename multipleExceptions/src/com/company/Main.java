package com.company;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {


        Test test = new Test();

      /*  try {
            test.Run();
        }
        catch (ParseException e ){
        e.printStackTrace();
        }
        catch (IOException e ){
            e.printStackTrace();
        }

        System.out.println("Finished");
    }

        try {
            test.Run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }*/

        try {
            test.input();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}