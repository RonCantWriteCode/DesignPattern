package cn.roncantwritecode.designpattern.visitorpattern;

/**
 * @author Ron Wu
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
