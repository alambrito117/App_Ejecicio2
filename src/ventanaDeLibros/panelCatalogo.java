package ventanaDeLibros;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class panelCatalogo extends JPanel{
    private JLabel cantidad;
    private JTextField campoC;
    private JButton btnComprar;
    panelCatalogo(){
        setPreferredSize(new Dimension(0,350));
        TitledBorder Borde = BorderFactory.createTitledBorder("Detalle del catalogo");
        //Aplicaremos un color al borde
        Borde.setTitleColor(Color.ORANGE);
        setBorder(Borde);

        //creación de una tabla
        DefaultTableModel dtm = new DefaultTableModel();

        //llenado del la tabla
        Object[] col1 = {"983-112-458","451-514-698","125-784-254","487-214-546","125-547-878"};
        dtm.addColumn("ISBN",col1);

        Object[] col2 = {"Algoritmica y programacíon","Programación en java","Lenguaje UML","Usando JUnit","Programación en C#"};
        dtm.addColumn("Titulo",col2);

        Object[] col3 = {"$ 57 000.00","$ 75 000.00","$ 43 500.00","$ 65 432.00"};
        dtm.addColumn("Precio", col3);

        //finalizamos con la tabla, e insertamos todo en el objeto JTable
        final JTable jt = new JTable(dtm);

        //aplicaremos una demencion a la tabla por defecto
        jt.setPreferredScrollableViewportSize(new Dimension(0,100));
        JScrollPane jsp = new JScrollPane(jt);
        setLayout(new BorderLayout());

        //lo siguiente, se creara un contenedor para los componentes que se encuentran debajo de la tabla.
        Container contieneCantidad = new Container();
        contieneCantidad.setLayout(new GridBagLayout());
        //creamos el el objeto restricciones
        GridBagConstraints gbc1 = new GridBagConstraints();

        //crearemos el fracmento de texto con el JLabel
        cantidad = new JLabel("Cantidad");
        gbc1.gridx = 2;
        gbc1.gridy = 0;
        contieneCantidad.add(cantidad,gbc1);

        //ahora haremos un cuadro de texto para obtener la cantidad
        campoC = new JTextField("2");
        gbc1.gridx = 2;
        gbc1.gridy = 1;
        gbc1.gridwidth = 2;
        gbc1.gridheight = 2;
        gbc1.ipadx = 100;
        gbc1.ipady = 1;
        contieneCantidad.add(campoC,gbc1);

        //realizamos sus restricciones al boton comprar
        btnComprar = new JButton("Comprar");
        gbc1.gridx = 4;
        gbc1.gridy = 2;
        gbc1.gridwidth = 0;
        gbc1.gridheight = 0;
        gbc1.ipadx = 0;
        gbc1.ipady = 0;
        contieneCantidad.add(btnComprar,gbc1);
        //agregamos un espaciado externo a travez insets en este caso arriba y abajo
         gbc1.insets.set(10,0,10,0);


        add(jsp,BorderLayout.NORTH);
        add(contieneCantidad);


    }
}
