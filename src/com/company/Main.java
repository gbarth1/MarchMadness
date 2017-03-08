package com.company;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("CompStats"));

        int max=-1;
        String stats[][] = new String[1000][1000];
        while(scan.hasNext()){

            max++;
            stats[max][max] = scan.nextLine();

        }
        scan.close();

        for(int i = 0; i<= stats.length; i++){
            String s = stats.toString(i);
            teams sea = new teams(stats);
        }



    }
}
