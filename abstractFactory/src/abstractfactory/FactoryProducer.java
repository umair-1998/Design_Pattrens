
package abstractfactory;

/**
 *
 * @author SP21-BSE-058
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String Type){   
      if(Type.equalsIgnoreCase("ROUNDED")){
         return new RoundedShapeFactory();         
      }else if (Type.equalsIgnoreCase("DOUBLEROUNDED")){
         return new DoubleRoundedShapeFactory();
      }else {
          return new ShapeFactory();
      }
   }
}
