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
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}