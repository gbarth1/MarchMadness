package com.company;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        String file = "CompStats";
        BufferedReader br = null;
        FileReader rf = null;

       try {
           rf = new FileReader(file);
           br = new BufferedReader(rf);

           String sCurrentLine;

           br = new BufferedReader(new FileReader(file));

           while ((sCurrentLine = br.readLine()) != null) {
               System.out.println(sCurrentLine);
           }
       }
       catch(IOException e) {
               e.printStackTrace();
           }

       finally {

       }
               /*Scanner scan = new Scanner(new File("CompStats"));
            int max=-1;
            String stats[][] = new String[1000][1000];
            while(scan.hasNext()){

                max++;
                stats[max][max] = scan.nextLine();

            }
            scan.close();
            System.out.print(stats);
        }
        catch(FileNotFoundException e){

            System.out.print("file not found");
        }
        finally{

            Scanner scan = new Scanner(new File("CompStats"));
            int max=-1;
            String stats[][] = new String[1000][1000];
            while(scan.hasNext()){

                max++;
                stats[max][max] = scan.nextLine();

            }
            scan.close();
            System.out.print(stats);
        }*/


        ;
        //for(int i = 0; i<= stats.length; i++){
           // String s = stats.toString(i);
           // teams sea = new teams(stats);
        }

        //stats.sort();

    }

