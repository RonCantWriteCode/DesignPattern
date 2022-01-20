package cn.roncantwritecode.designpattern.observerpattern;

/**
 * @author Ron Wu
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}