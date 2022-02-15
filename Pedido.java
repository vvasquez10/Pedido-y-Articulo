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

    public Pedido(){   
        this.nombre = "Invitado";
        this.items = new ArrayList<Articulo>();        
    }

    public double calculaTotal(ArrayList<Articulo> items) {
        double total=0;
        for(int i=0; i<items.size(); i++){
            total = total + items.get(i).getPrecio();
        }
        return total;
    }

    public void addArticulo(Articulo a){
        this.items.add(a);
        this.total = calculaTotal(items);
    }

    public String getStatusMessage(){
        if(this.listo){
            return "Tu pedido está listo.";
        } else {
            return "Gracias por esperar. Tu pedido estará listo pronto.";
        }        
    }

    public String display(){
        String resumen = "Nombre Cliente: "+this.nombre+"\n"+
                         this.displayArticulos()+
                         "Total: "+this.total;
        return resumen;
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

    public String displayArticulos(){
        /*Dado un ArrayList de elementos de menú (cadenas), imprime cada índice y elemento del menú.*/

        String resumen="";
        for(int i=0; i<this.items.size(); i++){
            resumen=resumen+items.get(i).getNombre()+" - "+items.get(i).getPrecio()+"\n";
        }
        return resumen;
    }



}