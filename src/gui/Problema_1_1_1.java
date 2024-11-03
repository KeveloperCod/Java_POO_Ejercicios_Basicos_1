package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import semana_01.Trabajador;;

public class Problema_1_1_1  extends JFrame {

	private JPanel contentPane;
	private JTextArea txtReporte;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_1_1 frame = new Problema_1_1_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_1_1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtReporte = new JTextArea();
			txtReporte.setBounds(10, 76, 480, 310);
			contentPane.add(txtReporte);
		}
		{
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Declarando y creando un objeto de tipo Docente
					Trabajador d= new Trabajador();
					  //Ingresamos datos fijos
					  d.codigo = 123;
					  d.nombre = "Danny";
					  d.horasT = 35;
					  d.tarifaH = 45.5;	 
					  //Visutalice todos sus datos 
					  imprimir("DirMen  :   " + d);
					  imprimir("Codigo  :   " + d.codigo);
					  imprimir("Nombre  :   " + d.nombre);
					  imprimir("Horas Trabajadas  :   " + d.horasT);
					  imprimir("Tarifa Horaria  :   " + d.tarifaH);
					  imprimir("Sueldo Bruto  :   " + d.sBruto());
					  imprimir("Descuento  :   " + d.descuento());
					  imprimir("Sueldo Neto  :   " + d.sNeto() + "\n"+"\n ");
					  
					  
					  
					  
					// Crear otro Docente
					  Trabajador d2 = new Trabajador();
					     //Ingrese datos fijos.
					     d2.codigo = 467 ;
					     d2.horasT = 25;
					     d2.nombre = "Kevin";
					     d2.tarifaH = 35.5 ;
					   //Visutalice todos sus datos 
						  imprimir("DirMen  :   " + d2);
						  imprimir("Codigo  :   " + d2.codigo);
						  imprimir("Nombre  :   " + d2.nombre);
						  imprimir("Horas Trabajadas  :   " + d2.horasT);
						  imprimir("Tarifa Horaria  :   " + d2.tarifaH);
						  imprimir("Sueldo Bruto  :   " + d2.sBruto());
						  imprimir("Descuento  :   " + d2.descuento());
						  imprimir("Sueldo Neto  :   " + d2.sNeto());
					  
					  
				}		
				
				
				
				
				 void imprimir(String s) {
					 
					 txtReporte.append(s + "\n");
					 
				}
			});
			btnCalcular.setBounds(202, 30, 89, 23);
			contentPane.add(btnCalcular);
		}
	}
}
