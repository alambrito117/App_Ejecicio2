package ventanaDeLibros;

import javax.swing.*;
import java.awt.*;

public class panelBotones extends JPanel{
    //instanciamos la variable que vamos a útilizar en este proceso
    private JButton AddLibro;
    private JButton Opcion1;
    private JButton Opcion2;

    panelBotones(){
        AddLibro = new JButton("Adicionar Libro");
        Opcion1 = new JButton("Opción 1");
        Opcion2 = new JButton("Opción 2");
        //le decimos al panel como se va comportar y bien lo hará con un GridLayout
        setLayout(new GridLayout(1,3));
        setPreferredSize(new Dimension (0,25));
        add(AddLibro);
        add(Opcion1);
        add(Opcion2);
    }


}
