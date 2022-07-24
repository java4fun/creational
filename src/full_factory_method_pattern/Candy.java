
package full_factory_method_pattern;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
