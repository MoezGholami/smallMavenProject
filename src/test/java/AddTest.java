import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
    @Test
    public void testAdd() {
        verifyAddingAPair(-1, 1);
        verifyAddingAPair(-10, 1);
        verifyAddingAPair(-1, 10);
        verifyAddingAPair(11, 10);
        verifyAddingAPair(-11, -10);
    }

    @Test
    public void testIncrement() {
        verifyIncrementingAnumber(-2);
        verifyIncrementingAnumber(-1);
        verifyIncrementingAnumber(0);
        verifyIncrementingAnumber(1);
    }

    private void verifyAddingAPair(int x, int y) {
        int expected = x + y, actual = Adder.add(x, y);
        assertEquals(expected, actual);
    }

    private void verifyIncrementingAnumber(int x) {
        int expected = x+1, actual = Adder.increment(x);
        assertEquals(expected, actual);
    }
}
