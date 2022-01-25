package cn.roncantwritecode.designpattern.interceptingfilterpattern;

/**
 * @author Ron Wu
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
