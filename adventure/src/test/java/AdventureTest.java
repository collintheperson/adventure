import models.Adventure;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AdventureTest {

    @Test
    public void MedivealTimeline_CanWeGetChoiceStep1_A() throws Exception {
        Adventure game = new Adventure();
        assertEquals("A", game.userChoice1("1A"));
    }

    @Test
    public void MedivealTimeline_CanWeGetChoiceStep2_A() throws Exception {
        Adventure game = new Adventure();
        assertEquals("A", game.userChoice2A("2A"));
    }

    @Test
    public void MedivealTimeline_CanWeGetChoiceStep3_A() throws Exception {
        Adventure game = new Adventure();
        assertEquals("A", game.userChoice3A("3A"));
    }

    @Test
    public void MedivealTimeline_CanWeGetChoiceStep4_A() throws Exception {
        Adventure game = new Adventure();
        assertEquals("A", game.userChoice4A("4A"));
    }


}