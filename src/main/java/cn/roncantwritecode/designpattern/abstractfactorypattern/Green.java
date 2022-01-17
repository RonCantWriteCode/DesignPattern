package cn.roncantwritecode.designpattern.abstractfactorypattern;

/**
 * @author Ron Wu
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
