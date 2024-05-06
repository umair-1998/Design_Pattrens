
package abstractfactory;

/**
 *
 * @author SP21-BSE-058
 */
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
          return new RoundedTriangle();
      }	 
      
      return null;
   }
}
