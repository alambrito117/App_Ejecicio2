package ventanaDeLibros;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class tiendaLibros extends JFrame{
    //declaramos los paneles para la Organización de nuestro trabajo.
    private JPanel anelBotones;
    private JPanel panelCatalogo;
    private JPanel carritoDeCompras;

    JFrame frame;
    tiendaLibros(){

        super("Tienda de libros");
        setSize(400,450);
        //Esto hará que se mueran todos los procesos al momento de cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        //Utilizaremos 3 BorderLayout para posicionar las secciones de la tienda de libros
        setLayout(new BorderLayout());

        //esta parte de las opciones por botones va estar orientado al norte
        panelBotones pBotones = new panelBotones();
        add(pBotones,BorderLayout.NORTH);

        //orientaremos al centro lo que es el detalle del catalogo
        panelCatalogo pCatalogo = new panelCatalogo();
        add(pCatalogo,BorderLayout.CENTER);

        //panel Carrito de comprar
        carritoDeCompras cdc = new carritoDeCompras();
        add(cdc,BorderLayout.SOUTH);
    }



    public static void main(String[] args) {
        tiendaLibros tiendaL = new tiendaLibros();
        tiendaL.setVisible(true);

    }
}
