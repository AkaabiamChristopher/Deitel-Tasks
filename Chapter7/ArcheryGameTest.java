import org.junit.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArcheryGameTest {
    @Test
    public void testValidScores() {
        ArcheryGame game = new ArcheryGame();
        game.scanner = new Scanner("5\n5\n5\n");
        assertDoesNotThrow(() -> game.getScores());
    }

    @Test
    public void testTotalScoreCalculation() {
        ArcheryGame game = new ArcheryGame();
        game.scanner = new Scanner("5\n5\n5\n");
        int totalScore = game.getTotalScore(0);
        assertEquals(15, totalScore);
    }

    @Test
    public void testWinnerDetermination() {
        ArcheryGame game = new ArcheryGame();
        game.scanner = new Scanner("10\n10\n10\n5\n5\n5\n5\n5\n5\n5\n5\n5\n");
        int winner = game.getWinner();
        assertEquals(1, winner);
    }
}