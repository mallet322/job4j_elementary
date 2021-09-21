package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void incorrectTriangle() {
        Point a = new Point(10000, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.001);
    }

}