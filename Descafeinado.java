
package cafe;

/**
 *
 * @author sistemas
 */
public class Descafeinado extends Cafe{
    @Override
     double costo(){
        return 1.05 + super.costo();
    }

    @Override
    public String getDescripcion() {
        return "Su orden Cafe Descafeinado" +super.getDescripcion();
    }
    
    
}
