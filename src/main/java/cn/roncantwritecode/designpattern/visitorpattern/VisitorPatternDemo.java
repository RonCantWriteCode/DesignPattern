package cn.roncantwritecode.designpattern.visitorpattern;

/**
 * @author Ron Wu
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
