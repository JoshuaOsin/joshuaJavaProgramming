package day03_EscapeSequences;

import java.util.Scanner;

    public class Timer {
        public static void main(String[] args) throws InterruptedException {
            Scanner scan=new Scanner(System.in);
            System.out.println("please enter amount of minutes");
            int minutes=scan.nextInt();

            for (int i = minutes; i > 0; i--) {
                for(int z=59;z>=0;z--){
                    System.out.print("\r"+(i-1)+" minutes and "+z+" second left");
                    Thread.sleep(1000);

                }
            }
            System.out.println("Get back to work!");


            scan.close();
        }
    }

