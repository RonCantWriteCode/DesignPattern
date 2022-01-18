package cn.roncantwritecode.designpattern.decoratorpattern;

/**
 * @author Ron Wu
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
