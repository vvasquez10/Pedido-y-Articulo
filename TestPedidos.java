import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {
    
        // Elementos del menú
        Articulo articulo1 = new Articulo("Mocca", 6.50);
        Articulo articulo2 = new Articulo("Capuchino", 9.50);
        Articulo articulo3 = new Articulo("Latte", 7.00);
        Articulo articulo4 = new Articulo("Cafe de Goteo", 5.90);

        ArrayList<Articulo> itemsPedido1 = new ArrayList<Articulo>();
        itemsPedido1.add(articulo1);
        itemsPedido1.add(articulo4);

        ArrayList<Articulo> itemsPedido2 = new ArrayList<Articulo>();
        itemsPedido2.add(articulo2);

        ArrayList<Articulo> itemsPedido3 = new ArrayList<Articulo>();
        itemsPedido3.add(articulo1);
        itemsPedido3.add(articulo4);
        itemsPedido3.add(articulo2);

        ArrayList<Articulo> itemsPedido4 = new ArrayList<Articulo>();
        itemsPedido4.add(articulo3);
        itemsPedido4.add(articulo4);

        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido("Cindhuri", itemsPedido1);
        Pedido pedido2 = new Pedido("Jimmy", itemsPedido2);
        Pedido pedido3 = new Pedido("Noah", itemsPedido3);
        Pedido pedido4 = new Pedido("Sam", itemsPedido4);

        Pedido pedido5 = new Pedido();
        pedido5.addArticulo(articulo2);
        pedido5.addArticulo(articulo3);
    
        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);

        pedido1.setListo(true);
        System.out.printf("Listo: %s\n", pedido1.listo+"\n");

        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.listo);

        pedido2.setListo(true);
        System.out.printf("Listo: %s\n", pedido2.listo+"\n");

        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.listo);

        pedido3.setListo(true);
        System.out.printf("Listo: %s\n", pedido3.listo+"\n");

        System.out.println(pedido3.display()+"\n");

        System.out.println(pedido5.display()+"\n");
    }
}