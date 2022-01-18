package cn.roncantwritecode.designpattern.decoratorpattern;

/**
 * @author Ron Wu
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
