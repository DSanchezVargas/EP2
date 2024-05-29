package cafe;

public class CafeD {

    public static void main(String[] args) {
        Cafe c1 = new Expreso();  
        
        c1.setCrema(true);
        System.out.println(c1.getDescripcion()+"\nTotal= " +c1.costo());
        
    
            Cafe c2 = new Descafeinado();
            c2.setCrema(true);
            c2.setLeche(true);
            c2.setSoya(true);
            c2.setMoca(true);
    
            System.out.println(c2.getDescripcion()+"\nTotal= " +c2.costo());
            

    
    }
}
