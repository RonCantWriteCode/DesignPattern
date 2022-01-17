package cn.roncantwritecode.designpattern.prototypepattern;

/**
 * @author Ron Wu
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
