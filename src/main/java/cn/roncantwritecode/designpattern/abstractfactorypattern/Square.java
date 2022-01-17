package cn.roncantwritecode.designpattern.abstractfactorypattern;

/**
 * @author Ron Wu
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}