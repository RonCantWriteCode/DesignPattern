package cn.roncantwritecode.designpattern.builderpattern;

/**
 * @author Ron Wu
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}