import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionsMatterTest {

    @Test
    public void name() {
        assertEquals(6, ExpressionsMatter.expressionsMatter(2, 1, 2));
        assertEquals(3, ExpressionsMatter.expressionsMatter(1, 1, 1));
        assertEquals(4, ExpressionsMatter.expressionsMatter(2, 1, 1));
        assertEquals(9, ExpressionsMatter.expressionsMatter(1, 2, 3));
        assertEquals(5, ExpressionsMatter.expressionsMatter(1, 3, 1));
        assertEquals(8, ExpressionsMatter.expressionsMatter(2, 2, 2));
    }
}