package cn.roncantwritecode.designpattern.builderpattern;

/**
 * @author Ron Wu
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
