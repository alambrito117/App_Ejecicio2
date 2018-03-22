package ventanaDeLibros;

import sun.swing.SwingAccessor;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class carritoDeCompras extends JPanel{
    private final JTable jt;
    private JScrollPane jsp;
    private JButton borrar;
    private JTextField campoTexto;
    private JLabel txt;
    carritoDeCompras(){
        //parte del borde
        setPreferredSize(new Dimension(0,150));
        TitledBorder bordex = BorderFactory.createTitledBorder("Detalle de carrirto de compra");
        //color de borde
        bordex.setTitleColor(Color.ORANGE);
        setBorder(bordex);

        //parte de la tabla.
        DefaultTableModel dtm = new DefaultTableModel();

        //llenado de tabla
        Object[] col1 = {"985,564,854"};
        dtm.addColumn("ISBN",col1);

        Object[] col2 = {"El lenguaje UML"};
        dtm.addColumn("Titulo",col2);

        Object[] col3 = {"3"};
        dtm.addColumn("Cantidad",col3);

        Object[] col4 = {"$ 130 500.00"};
        dtm.addColumn("Subtotal",col4);

        jt = new JTable(dtm);
        jt.setPreferredScrollableViewportSize(new Dimension(0,50));
        jsp =new JScrollPane(jt);

        setLayout(new BorderLayout());

        //creamos contenedor para borrar u total
        Container contieneComponentes = new Container();
        contieneComponentes.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        borrar = new JButton("Borrar");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        gbc.ipady = 0;
        gbc.insets.set(0,0,0,130);
        contieneComponentes.add(borrar,gbc);

        txt = new JLabel("Total: ");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        contieneComponentes.add(txt,gbc);

        campoTexto = new JTextField ("$ 130 500.00");
        campoTexto.setEditable(false);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        gbc.ipady = 0;
        gbc.insets.set(0,0,0,0);
        contieneComponentes.add(campoTexto,gbc);
        add(jsp,BorderLayout.NORTH);
        add(contieneComponentes,BorderLayout.CENTER);









    }

}
