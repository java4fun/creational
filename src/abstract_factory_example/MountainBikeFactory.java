
package abstract_factory_example;

/**
 *
 * @author bethan
 */
public class MountainBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
    
    @Override
    public Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
    
}
