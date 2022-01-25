package cn.roncantwritecode.designpattern.interceptingfilterpattern;

/**
 * @author Ron Wu
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
