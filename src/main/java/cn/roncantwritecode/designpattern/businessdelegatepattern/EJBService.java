package cn.roncantwritecode.designpattern.businessdelegatepattern;

/**
 * @author Ron Wu
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
