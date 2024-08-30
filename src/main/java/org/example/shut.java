package org.example;

public class shut {

        public static void exit() throws InterruptedException{
            System.out.print("Exiting from software");
            int i=3;
            while(i>0){
                System.out.print(".");
                Thread.sleep(600);
                i--;
            }
            System.out.println();
            System.out.println("Thanks for using Our Software!!!");
        }
    }

