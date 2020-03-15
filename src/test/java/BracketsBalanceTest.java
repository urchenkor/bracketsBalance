import org.junit.Test;
import static org.junit.Assert.*;

public class BracketsBalanceTest {
    @Test
    public void bracketsBalanceTest() throws Exception {
        //Arrange
        BracketsBalance bB = new BracketsBalance();

        //Act
        boolean result_true = bB.bracketsBalance("a[]b()c{}");
        boolean result_false = bB.bracketsBalance("a{}b[]c)(");

        //Assert
        assertTrue(result_true);
        assertFalse(result_false);

    }
}
