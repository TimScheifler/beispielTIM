package de.timscheifler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //System.out.println("Hello World");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Gib was ein: ");
        String eingabe = br.readLine();
        for(int i = 0; i<eingabe.length();i++){
            char tmp = eingabe.charAt(i);
            if(tmp>='a'&&tmp<='z'){
                tmp-=32;
            }
            System.out.printf(tmp+"");
        }
    }
}
