package com.javarush.test.test.kustsanin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by �������� on 02.12.2015.
 */
public class Scanner_test
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
        System.out.println("lol ���");
        while (true)
        {
            String inp = reader.readLine();
            if(inp.equals("end")) break;
            if(inp.contains(".")) {
                String[] inputs = inp.split(Pattern.quote("."));
                System.out.println("� ������: " + inputs[0]);
                System.out.println("����� ������: " + inputs[1]);
            }
        }
    }
}
