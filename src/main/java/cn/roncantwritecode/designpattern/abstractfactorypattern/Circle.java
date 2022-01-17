package cn.roncantwritecode.designpattern.abstractfactorypattern;

/**
 * @author Ron Wu
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}