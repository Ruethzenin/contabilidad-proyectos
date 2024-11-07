package logica;

public class Lote {
    private double costo;
    private int unidades;
    private double costoDelLote;

    public Lote(double costo, int unidades) {
        this.costo = costo;
        this.unidades = unidades;
    }

    public boolean vender(int unidadParaVenta){
        if (unidadParaVenta <= this.unidades){
            this.unidades -= unidadParaVenta;
            return false;
        }
        return true;
    }

    public boolean revisarVenta(int unidades){
        if (unidades <= this.unidades){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "costo=" + costo +
                ", unidades=" + unidades +
                ", costoDelLote=" + costoDelLote +
                '}';
    }

    public double getCosto() {
        return costo;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getCostoDelLote() {
        return unidades * costo;
    }

}
