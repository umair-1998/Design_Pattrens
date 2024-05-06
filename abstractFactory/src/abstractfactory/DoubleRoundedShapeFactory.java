
package abstractfactory;

/**
 *
 * @author SP21-BSE-058
 */
public class DoubleRoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DoubleRoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new DoubleRoundedSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
          return new DoubleRoundedTriangle();
      }	 
      
      return null;
   }
}
