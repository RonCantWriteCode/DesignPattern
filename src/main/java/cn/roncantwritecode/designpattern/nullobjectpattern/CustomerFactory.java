package cn.roncantwritecode.designpattern.nullobjectpattern;

/**
 * @author Ron Wu
 */
public class CustomerFactory {

    public static final String[] NAMES = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < NAMES.length; i++) {
            if (NAMES[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
