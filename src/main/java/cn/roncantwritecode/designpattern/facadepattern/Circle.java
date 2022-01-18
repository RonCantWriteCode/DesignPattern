package cn.roncantwritecode.designpattern.facadepattern;

/**
 * @author Ron Wu
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
