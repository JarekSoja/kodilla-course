package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("ShapeCollector tests starting");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("ShapeCollector tests ended");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Executing test number " + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
       Circle circle = new Circle("circle", 2);
       ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(1, collector.getShapes().size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Square square = new Square("square", 4);
        Circle circle = new Circle("circle", 2);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);
        collector.addFigure(circle);
        collector.removeFigure(square);

        //Then
        Assert.assertEquals(1, collector.getShapes().size());
    }
    @Test
    public void testGetFigure(){
        //Given
        Triangle triangle = new Triangle("triangle", 2,4);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(triangle);
        Shape testTriangle = collector.getFigure(0);

        //Then
        Assert.assertEquals(triangle, testTriangle);
    }
    @Test
    public void testShowFigures(){
        //Given
        Triangle triangle = new Triangle("triangle", 2,4);
        Square square = new Square("square", 4);
        Circle circle = new Circle("circle", 2);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);
        ArrayList retrievedShapes = collector.getShapes();

        //Then
        Assert.assertEquals(collector.getShapes(), retrievedShapes);
    }
}
