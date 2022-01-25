package cn.roncantwritecode.designpattern.businessdelegatepattern;

/**
 * @author Ron Wu
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if("EJB".equalsIgnoreCase(serviceType)){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
