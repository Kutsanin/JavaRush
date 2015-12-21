package com.javarush.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tst
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nS = reader.readLine();
        int n = Integer.parseInt(nS);
        for(int i = 0; i < n; i++) {
            System.out.println("hello world");
        }
    }
}
