package logica;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ueps {
    private List<Lote> listaDeLotes;
    private double saldoValor;
    private int saldoUnidades;

    //Constructor

    public Ueps(double saldoValor, int saldoUnidades) {
        this.listaDeLotes = new LinkedList<>();;
        this.saldoValor = saldoValor;
        this.saldoUnidades = saldoUnidades;
    }

    //Metodos

    public double getValorDeVenta(int unidades) {
            ArrayList<Double> tikect = new ArrayList<Double>();
            int indicador;
            indicador = getListaDeLotes().size() - 1;
            while (listaDeLotes.get(indicador).revisarVenta(unidades)) {
                tikect.add(listaDeLotes.get(indicador).getUnidades() * listaDeLotes.get(indicador).getCosto());
                unidades -= listaDeLotes.get(indicador).getUnidades();
                indicador--;
            }
            tikect.add(unidades * listaDeLotes.get(indicador).getCosto());
            return sumarElementos(tikect);
    }

    public List<String> getCostosDeVenta(int unidades){
        List<String> tikect = new ArrayList<>();
        int indicador;
        indicador = getListaDeLotes().size() - 1;
        while (listaDeLotes.get(indicador).revisarVenta(unidades)) {
            tikect.add(listaDeLotes.get(indicador).getUnidades() + " * " + listaDeLotes.get(indicador).getCosto());
            unidades -= listaDeLotes.get(indicador).getUnidades();
            indicador--;
        }
        tikect.add(unidades + " * " + listaDeLotes.get(indicador).getCosto());
        return tikect;
    }

    public void vende (int unidades){
        while (listaDeLotes.getLast().vender(unidades)) {
            unidades -= listaDeLotes.getLast().getUnidades();
            listaDeLotes.removeLast();
        }
    }

    public void compra (double costo, int unidades){
        Lote lote = new Lote(costo, unidades);
        listaDeLotes.add(lote);
    }

    public double sumarElementos(ArrayList<Double> list) {
        double product = 0;
        for (double number : list) {
            product += number;
        }
        return product;
    }

    //Getters Y Setters

    public int getSaldoUnidades() {
        int sumaUnidades = 0;
        for (Lote lote : listaDeLotes) {
            sumaUnidades += lote.getUnidades();
        }
        this.saldoUnidades = sumaUnidades;
        return saldoUnidades;
    }

    public double getSaldoValor() {
        double sumaSaldo = 0;
        for (Lote lote : listaDeLotes) {
            sumaSaldo += lote.getCostoDelLote();
        }
        this.saldoValor = sumaSaldo;
        return saldoValor;
    }

    public List<Lote> getListaDeLotes() {
        return listaDeLotes;
    }
}
