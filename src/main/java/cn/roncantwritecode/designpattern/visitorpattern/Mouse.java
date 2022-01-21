package cn.roncantwritecode.designpattern.visitorpattern;

/**
 * @author Ron Wu
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
