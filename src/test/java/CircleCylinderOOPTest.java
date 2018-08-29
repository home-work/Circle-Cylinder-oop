import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleCylinderOOPTest {
    @Test
    public void testClassCircle() {
        Circle circle = new Circle(3);
        String expect = "Hình tròn có bán kính: 3.0";
        String actual = circle.toString();
        assertEquals(expect, actual);
    }
}
