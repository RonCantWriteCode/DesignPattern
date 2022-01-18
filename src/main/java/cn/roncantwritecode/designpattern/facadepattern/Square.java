package cn.roncantwritecode.designpattern.facadepattern;

/**
 * @author Ron Wu
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
