
package simple_factory_method;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
