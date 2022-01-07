package cn.roncantwritecode.designpattern.factorypattern;

/**
 * @author Ron Wu
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
}