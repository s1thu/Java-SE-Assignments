package com.factorypattern.utl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Reader {

    private static Reader reader;

    private BufferedReader br;
    private Reader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static Reader getBufferReader(){
        if(reader == null){
            reader = new Reader();
        }
        return reader;
    }

    public String readLine(){
        try {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
