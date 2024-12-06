package org.howard.edu.lsp.finalexam.question3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Test class for ShapeRenderer
public class ShapeRendererTest {
    private ShapeRenderer renderer;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // Set up test environment
    @Before
    public void setUp() {
        renderer = new ShapeRenderer();
        System.setOut(new PrintStream(outContent));
    }

    // Test circle rendering
    @Test
    public void testRenderCircle() {
        renderer.renderShape("circle");
        assertEquals("Drawing a Circle\n", outContent.toString());
    }

    // Test rectangle rendering
    @Test
    public void testRenderRectangle() {
        renderer.renderShape("rectangle");
        assertEquals("Drawing a Rectangle\n", outContent.toString());
    }

    // Test triangle rendering
    @Test
    public void testRenderTriangle() {
        renderer.renderShape("triangle");
        assertEquals("Drawing a Triangle\n", outContent.toString());
    }

    // Test unknown shape rendering
    @Test
    public void testRenderUnknownShape() {
        renderer.renderShape("hexagon");
        assertEquals("Unknown shape type: hexagon\n", outContent.toString());
    }

    // Clean up after tests
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
