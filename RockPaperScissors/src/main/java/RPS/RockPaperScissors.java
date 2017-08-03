package RPS;
import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    Map<String, Integer> RPS = new HashMap<String, Integer>();
    int output = false;

    public RockPaperScissors() {
        RPS.put("rock",3);
        RPS.put("scissors",2);
        RPS.put("paper",1);
    }
    public boolean Whowins(String userInput1, String userInput2) {
        int Input1 = RPS.get(userInput1);
        int Input2 = RPS.get(userInput2);
        if (Input1 > Input2) {
            return true;
        }

    }
    public boolean whoTies(String userInput1, String userInput2) {
        if (userInput1.equals(userInput2)) {
        }
        return false;
    }

}
