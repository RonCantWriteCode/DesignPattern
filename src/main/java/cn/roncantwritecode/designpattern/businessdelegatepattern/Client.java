package cn.roncantwritecode.designpattern.businessdelegatepattern;

/**
 * @author Ron Wu
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
