package access.local;


import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test {
	public static void main(String[] args) {
		double Wth, Wer, Wfo, WE, K, d, g;
		int a, b, c, e, f, h;
		String result;
		
		// Wth
		result = JOptionPane.showInputDialog("Enter RAM from 2-8 GB");
		a = Integer.parseInt(result);
		result = JOptionPane.showInputDialog("Enter Memory from 16-512 GB");
		b = Integer.parseInt(result);
		result = JOptionPane.showInputDialog("Enter Сores(СPU) from 1-10");
		c = Integer.parseInt(result);
		result = JOptionPane.showInputDialog("Enter CPU Frequency from 1000-3500 MHz");
		d = Double.parseDouble(result);
		result = JOptionPane.showInputDialog("Enter a capacity of battery from 1000-6000 mAh");
		e = Integer.parseInt(result);
		// Wer
		result = JOptionPane.showInputDialog("Enter a resolution of a display");
		f = Integer.parseInt(result);
		// Wfo
		result = JOptionPane.showInputDialog("Enter a quantity of pixels in camera");
		g = Double.parseDouble(result);
		// Price
		result = JOptionPane.showInputDialog("Enter a price of your device");
		h = Integer.parseInt(result);
		
		// Computing by Formulas
		Wth = (0.3 * (((0.6 * a) + (0.4 * b)) + (0.5 * ((0.5 * c) + (0.5 * (d / 1000)))) + (0.2 * (e / 1000))));
		Wer = (0.3 * (f/1000));
		Wfo = (0.1 * (0.2 * g));
		WE = Wth + Wer + Wfo;
		K = WE/h;
		
		// Output
		JOptionPane.showMessageDialog(null, "Response: " + "\n" + "K = " + K + "\n" + "WE = " + WE);
	

	}
}

