package cn.roncantwritecode.designpattern.interceptingfilterpattern;

/**
 * @author Ron Wu
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
