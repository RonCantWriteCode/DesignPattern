package cn.roncantwritecode.designpattern.abstractfactorypattern;

/**
 * @author Ron Wu
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape) ;
}
