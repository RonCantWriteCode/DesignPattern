package cn.roncantwritecode.designpattern.commandpattern;

/**
 * @author Ron Wu
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
