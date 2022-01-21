package cn.roncantwritecode.designpattern.visitorpattern;

/**
 * @author Ron Wu
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
