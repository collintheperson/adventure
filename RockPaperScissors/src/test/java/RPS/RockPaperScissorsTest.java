package RPS;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

   @Test
   public void Whowins_Rock_3() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Integer expected = 3;
        assertEquals(expected, testRockPaperScissors.Whowins("rock"));
    }
    @Test
   public void Whowins_RockvsRock_3() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Boolean expected = true;
        assertEquals(expected, testRockPaperScissors.whoTies("rock", "rock"));
    }

    @Test
    public void Whowins_RockvsScissors_true() throws Exception {
        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
        Boolean expected = true;
        assertEquals(expected, testRockPaperScissors.whoTies("rock", "rock"));
    }

//    @Test
//    public void Whowins_RockvsScissors_3() throws Exception {
//        RockPaperScissors testRockPaperScissors = new RockPaperScissors();
//        Integer expected = 3;
//        assertEquals(expected, testRockPaperScissors.whoWins("rock", "scissors"));
//    }
}