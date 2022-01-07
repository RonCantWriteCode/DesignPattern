package cn.roncantwritecode.designpattern.factorypattern;

/**
 * @author Ron Wu
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        // 使用 getShape 方法获取形状类型的对象
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}