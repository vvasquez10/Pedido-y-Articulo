import java.util.*;

public class Pedido{
    String nombre;
    double total;
    boolean listo;
    ArrayList<Articulo> items;

    public Pedido(String nombre, ArrayList<Articulo> items){
        this.nombre = nombre;
        this.total = calculaTotal(items);
        this.listo = false;
        this.items = items;
    }

    private double calculaTotal(ArrayList<Articulo> items) {
        double total=0;
        for(int i=0; i<items.size(); i++){
            total = total + items.get(i).precio;
        }
        return total;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getTotal(){
        return this.total;
    }

    public boolean getListo(){
        return this.listo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }



}