package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame{
	JTextField tNombre, tLaboratorio;
	JTextArea tDescripcion;
	JButton bBorrar, bAgregar, bVolver, bBuscar, bAsignar, bQuitar;
	GridBagConstraints gbc;
	Font titleFont = new Font("Cascadia Code", Font.PLAIN, 40);
	Font subTitleFont = new Font("Cascadia Code", Font.PLAIN, 15);
	Font textFont = new Font("Cascadia Code", Font.PLAIN, 13);
	Font subButton = new Font("Casicada Code", Font.BOLD, 9);
	
	public Vista() {
		// TODO Auto-generated constructor stub
		super("COMPUTADORAS");
		this.setSize(450, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"", ""}, 0) {
		    @Override
		    public Class<?> getColumnClass(int columnIndex) {
		        return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
		    }
		};

		model.addRow(new Object[]{false, "Elemento 1"});
		model.addRow(new Object[]{false, "Elemento 2"});
		model.addRow(new Object[]{false, "Elemento 3"});
	
		JPanel pNorte = new JPanel();
		JLabel prueba = new JLabel("COMPUTADORA", JLabel.CENTER);
		prueba.setFont(titleFont);
		pNorte.add(prueba);
		this.add(pNorte, BorderLayout.NORTH);
		
		JPanel pSur = new JPanel();
		pSur.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(1, 15, 10, 15);
		bVolver = new JButton("Volver");
		pSur.add(bVolver, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(1, 15, 10, 15);
		bBorrar = new JButton("Borrar");
		pSur.add(bBorrar, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(1, 15, 10, 15);
		bAgregar = new JButton("Agregar");
		pSur.add(bAgregar, gbc);
		
		this.add(pSur, BorderLayout.SOUTH);
		
		JPanel pCentro = new JPanel();
		pCentro.setLayout(new GridBagLayout());
		
		JPanel pBuscador = new JPanel();
		pBuscador.setLayout(new GridBagLayout());
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0; 
		pCentro.add(new JPanel(), gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.0; 
		gbc.anchor = GridBagConstraints.EAST;
		gbc.insets = new Insets(1, 1, 10, 1);
		JLabel lLaboratorio = new JLabel("Laboratorio:");
		lLaboratorio.setFont(textFont);
		pCentro.add(lLaboratorio, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.WEST;
		tLaboratorio = new JTextField(6);
		tLaboratorio.setEditable(false);
		pCentro.add(tLaboratorio, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(1, 6, 1, 1);
		JLabel lNombre = new JLabel("Nombre:");
		lNombre.setFont(subTitleFont);
		pBuscador.add(lNombre, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(1, 4, 1, 1);
		tNombre = new JTextField(22);
		pBuscador.add(tNombre, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(1, 4, 1, 1);
		bBuscar = new JButton("Buscar");
		bBuscar.setPreferredSize(new Dimension(70, 20));
		bBuscar.setFont(subButton);
		pBuscador.add(bBuscar, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		gbc.insets = new Insets(1, 3, 1, 3);
		pCentro.add(pBuscador, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 20, 1, 1);
		JLabel lDescripcion = new JLabel("Descripcion:");
		lDescripcion.setFont(subTitleFont);
		pCentro.add(lDescripcion, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 80, 1, 1);
		JLabel lComponentes = new JLabel("Componentes:");
		lComponentes.setFont(subTitleFont);
		pCentro.add(lComponentes, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 4;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(8, 10, 20, 1);
		tDescripcion = new JTextArea();
		tDescripcion.setLineWrap(true);
		tDescripcion.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(tDescripcion, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(120, 230));
		pCentro.add(scrollPane, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 4;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 40, 20, 1);
		JTable table = new JTable(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(90);
        table.setTableHeader(null);
        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(true);
        JScrollPane scrollPane2 = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setPreferredSize(new Dimension(120, 230));
        pCentro.add(scrollPane2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10, 1, 1, 18);
		bAsignar = new JButton("Asignar");
		bAsignar.setFont(subButton);
		bAsignar.setPreferredSize(new Dimension(70, 20));
		pCentro.add(bAsignar, gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(8, 1, 1, 18);
		bQuitar = new JButton("Quitar");
		bQuitar.setFont(subButton);
		bQuitar.setPreferredSize(new Dimension(70, 20));
		pCentro.add(bQuitar, gbc);
		
		this.add(pCentro, BorderLayout.CENTER);
	}
}
