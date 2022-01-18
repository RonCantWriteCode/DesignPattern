package cn.roncantwritecode.designpattern.facadepattern;

/**
 * @author Ron Wu
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
