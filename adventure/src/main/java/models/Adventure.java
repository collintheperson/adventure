package models; /**
 * Created by Guest on 8/3/17.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adventure {


    public String userChoice1(String userChoice){
        if (userChoice.equals("1A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("1B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }

    public String userChoice2A(String userChoice){
        if (userChoice.equals("1A"))  {
            return "A";
        }else if (userChoice.equals("1B")) {
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }

    public String userChoice2B(String userChoice){
        if (userChoice.equals("2A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("2B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }
    public String userChoice3A(String userChoice){
        if (userChoice.equals("3A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("3B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }

    public String userChoice3B(String userChoice){
        if (userChoice.equals("3A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("3B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }
    public String userChoice4A(String userChoice){
        if (userChoice.equals("4A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("4B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }

    public String userChoice4B(String userChoice){
        if (userChoice.equals("4A"))  {
            System.out.println("");
            return "A";
        }else if (userChoice.equals("4B")) {
            System.out.println("");
            return "B";
        }else {
            System.out.println("Please enter a valid choice");
            return "";
        }
    }
}
