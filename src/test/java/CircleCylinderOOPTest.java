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

    @Test
    public void testClassCylinder() {
        Cylinder cylinder = new Cylinder(3,4);
        String expect = "Hình trụ có chiều cao là: 4.0 và có diện tích là: 28.26";
        String actual = cylinder.toString();
        assertEquals(expect, actual);
    }
}
