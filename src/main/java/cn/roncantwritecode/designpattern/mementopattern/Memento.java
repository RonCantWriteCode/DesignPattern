package cn.roncantwritecode.designpattern.mementopattern;

/**
 * @author Ron Wu
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
