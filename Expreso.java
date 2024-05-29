
package cafe;

/**
 *
 * @author sistemas
 */
public class Expreso extends Cafe {
    
    @Override
     double costo(){
        return 1.99 + super.costo();
    }

    @Override
    public String getDescripcion() {
        return "Su orden Cafe Expreso" +super.getDescripcion();
    }
    
    
}
