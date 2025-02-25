//This project was created by Julian Reinstein, aka TheRealJReinstein.

import java.util.Scanner;
import java.util.ArrayList;

public class shareThis {
    public static void main(String args[]) {
        String stop = "s";
        String next = "n";
        Scanner myScan = new Scanner(System.in);
        boolean boo = true;

        ArrayList<String> termList = new ArrayList<String>();
        termList.add("example term");

        ArrayList<String> defList = new ArrayList<String>();
        defList.add("example definition");

        while(boo == true)
        {
            
            System.out.println("Press 'n' answer a flashcard. Press 's' to stop.");
            String opt = myScan.nextLine();

            if(opt.equals(stop))
            {
                boo = false;
            }
            
            else if(opt.equals(next) && defList.size() > 0)
            {
                System.out.println();
                int size = defList.size();
                int random = (int)(Math.random() * size);
                System.out.println(defList.get(random));
                String answer = myScan.nextLine();
                System.out.println();
                if(answer.equals(termList.get(random)))
                {
                    System.out.println("Correct! Nicely done.");
                    System.out.println();
                    defList.remove(random);
                    termList.remove(random);
                }
                else
                {
                    System.out.println("Sorry, the answer is " + termList.get(random));
                    System.out.println();
                }
            }
            else
            {
                System.out.println();
                System.out.println("Invalid input. Try again.");
                System.out.println();
            }
            
            if(defList.size() == 0)
            {
                System.out.println("Game over!");
                boo = false;
            }

        }

    }
}
