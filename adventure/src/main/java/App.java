import models.Adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/3/17.
 */
public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        while(run) {
            try {
                Adventure game = new Adventure();
                System.out.println("You arise suddenly to the sound of a giant thunderstorm overhead.");
                System.out.println("1A. Investigate outside");
                System.out.println("1B. Go back to sleep");
                String userChoice1 = bufferedReader.readLine();
                if (userChoice1.equals("1A")) {
//                    String as = game.userChoice2A(userChoice1);
//                    if(as.equals("A")){
                    System.out.println("You chose to investigate. You find an amulet glowing in the dark.");
                    System.out.println("2A. Pick it up");
                    System.out.println("2B. Destroy it");
                    String userChoice2A = bufferedReader.readLine();
                }else if(userChoice1.equals("2B")) {
                    System.out.println("You chose to sleep in. You wake up 2 hours later to find yourself tied to the bed");
                    System.out.println("2A. Scream for help");
                    System.out.println("2B. Try to untie yourself");
                    String userChoice2B = bufferedReader.readLine();
                    if (userChoice2B.equals("2A")) {
                        System.out.println("You die");
                    }else if (userChoice2B.equals("2B")) {
                        System.out.println("You are successful in untieing yourself. You go outside and relize that you have transported back 1500 years.");
                    }

                } else if (userChoice1.equals("1B")) {
                    game.userChoice2B(userChoice1);
                } else {
                    System.out.println("Please enter a valid choice");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
