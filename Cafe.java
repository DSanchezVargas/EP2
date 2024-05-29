package cafe;

/**
 *
 * @author sistemas
 */
public class Cafe {

    String Descripcion = "";
    boolean Leche;
    boolean Soya;
    boolean Moca;
    boolean Crema;
    double Leche_Costo = 0.1;
    double Soya_Costo = 0.2;
    double Moca_Costo = 0.15;
    double Crema_Costo = 0.1;

    double costo() {
        double total = 0;
        if (isLeche()) {
            total = total + Leche_Costo;
        }
        if (isSoya()) {
            total += Soya_Costo;
        }
        if (isMoca()) {
            total += Moca_Costo;
        }
        if (isCrema()) {
            total += Crema_Costo;
        }

        return total;
    }

    public boolean isLeche() {
        return Leche;
    }

    public void setLeche(boolean Leche) {
        this.Leche = Leche;
    }

    public boolean isSoya() {
        return Soya;
    }

    public void setSoya(boolean Soya) {
        this.Soya = Soya;
    }

    public boolean isMoca() {
        return Moca;
    }

    public void setMoca(boolean Moca) {
        this.Moca = Moca;
    }

    public boolean isCrema() {
        return Crema;
    }

    public void setCrema(boolean Crema) {
        this.Crema = Crema;
    }

    public String getDescripcion() {
        if (isLeche()) {
            Descripcion += ", Leche";
        }
        if (isSoya()) {
            Descripcion += ", Soya";
        }
        if (isMoca()) {
            Descripcion +=", Moca";
        }
        if (isCrema()) {
            Descripcion += ", Crema";
        }
        return Descripcion;
    }

}
