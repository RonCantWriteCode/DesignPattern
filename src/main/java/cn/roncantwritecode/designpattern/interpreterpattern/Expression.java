package cn.roncantwritecode.designpattern.interpreterpattern;

/**
 * @author Ron Wu
 */
public interface Expression {
    boolean interpret(String context);
}
