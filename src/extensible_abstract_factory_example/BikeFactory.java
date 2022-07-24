
package extensible_abstract_factory_example;

/**
 *
 * @author bethan
 */
public abstract class BikeFactory {           
    
    abstract BikePart create(String type);
    
}
