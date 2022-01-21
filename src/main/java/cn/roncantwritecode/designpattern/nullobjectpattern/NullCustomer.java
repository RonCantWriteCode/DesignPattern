package cn.roncantwritecode.designpattern.nullobjectpattern;

/**
 * @author Ron Wu
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
