package cn.roncantwritecode.designpattern.abstractfactorypattern;

/**
 * @author Ron Wu
 */
public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
