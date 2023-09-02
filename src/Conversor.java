package challenge2oracleone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Conversor extends JOptionPane {
	public Conversor() {
	}
	/**
	 * Launch the application.
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		JOptionPane optionPane = new JOptionPane();
		Object[] options = {"Pesos -> USD", "Pesos -> EUR", "Pesos -> GBP", "Pesos -> JPY", "Pesos -> KRW", "USD -> Pesos", "EUR -> Pesos","GBP -> Pesos","JPY -> Pesos","KRW -> Pesos"};
		int codigoConv = 0;
		optionPane.setBounds(77, 46, 96, 19); 
		boolean flag = true;
		while(flag) {
			Object cuadro = optionPane.showInputDialog(null, "Elige la moneda a convertir", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			String opciones = null;
			if(cuadro!=null) {
				opciones = cuadro.toString();
			}
			if(opciones == null) {
				optionPane.showMessageDialog(null, "Programa terminado.");
				flag = false;
			} else {
			switch(opciones) {
				    case "Pesos -> USD":
				        JOptionPane.showMessageDialog(null, "You selected Pesos -> USD");
				        break;
				    case "Pesos -> EUR":
				        JOptionPane.showMessageDialog(null, "You selected Pesos -> EUR");
				        codigoConv = 1;
				        break;
				    case "Pesos -> GBP":
				        JOptionPane.showMessageDialog(null, "You selected Pesos -> GBP");
				        codigoConv = 2;
				        break;
				    case "Pesos -> JPY":
				        JOptionPane.showMessageDialog(null, "You selected Pesos -> JPY");
				        codigoConv = 3;
				        break;
				    case "Pesos -> KRW":
				        JOptionPane.showMessageDialog(null, "You selected Pesos -> KRW");
				        codigoConv = 4;
				        break;
				    case "USD -> Pesos":
				        JOptionPane.showMessageDialog(null, "You selected USD -> Pesos");
				        codigoConv = 5;
				        break;
				    case "EUR -> Pesos":
				        JOptionPane.showMessageDialog(null, "You selected EUR -> Pesos");
				        codigoConv = 6;
				        break;
				    case "GBP -> Pesos":
				        JOptionPane.showMessageDialog(null, "You selected GBP -> Pesos");
				        codigoConv = 7;
				        break;
				    case "JPY -> Pesos":
				        JOptionPane.showMessageDialog(null, "You selected JPY -> Pesos");
				        codigoConv = 8;
				        break;
				    case "KRW -> Pesos":
				        JOptionPane.showMessageDialog(null, "You selected KRW -> Pesos");
				        codigoConv = 9;
				        break;
				}
				String input = optionPane.showInputDialog(null,"Ingrese la cantidad.","Input", JOptionPane.PLAIN_MESSAGE);
				if(input!=null && validarNumero(input)) {
					double conv = 0;
					double numini = Double.parseDouble(input);
					switch(codigoConv) {
					case 0:
						conv = numini / 730;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " dolares.");
				        break;
					case 1:
						conv = numini / 840;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " euros.");
				        break;
					case 2:
						conv = numini / 912;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " libras.");
				        break;
					case 3:
						conv = numini / 4.96;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " yenes.");
				        break;
					case 4:
						conv = numini / 0.55;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " wones.");
				        break;
					case 5:
						conv = numini * 730;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " pesos.");
				        break;
					case 6:
						conv = numini * 840;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " pesos.");
				        break;
					case 7:
						conv = numini * 912;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " pesos.");
				        break;
					case 8:
						conv = numini * 4.96;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " pesos.");
				        break;
					case 9:
						conv = numini * 0.55;
				        JOptionPane.showMessageDialog(null, "Tienes " + conv + " pesos.");
				        break;
					}
				} else {
					optionPane.showMessageDialog(null, "Entrada no valida.", "Error", JOptionPane.ERROR_MESSAGE);
			
				}
				int seguir = optionPane.showConfirmDialog(null, "¿Continuar?");
				if (seguir != optionPane.OK_OPTION) {
					flag = false;
					optionPane.showMessageDialog(null, "Programa terminado.");
				}
			}
		}
	}
	
	
	//Valida que el input sea un numero.
	private static boolean validarNumero(String input) {
		boolean res = false;
		try {
			double x = Double.parseDouble(input);
			if (x<0 || x>=0)
				res = true;
		} catch (NumberFormatException e) {
			res = false;
		}
		return res;
	}

}
