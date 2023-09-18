import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RansomNoteTest {
    RansomNote ransomNote = new RansomNote();

    @Test
    public void testSolution() {
        List<String> magazine = new ArrayList<>();
        magazine.add("give");
        magazine.add("me");
        magazine.add("one");
        magazine.add("grand");
        magazine.add("today");
        magazine.add("night");

        List<String> note = new ArrayList<>();
        note.add("give");
        note.add("one");
        note.add("grand");
        note.add("today");

        ransomNote.checkMagazine(magazine, note);


    }


}
