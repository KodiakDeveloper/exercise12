package selectionStructures;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {

		Double a, b, c, arithmeticMean;

		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a: "));

		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b: "));

		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Input c: "));

		arithmeticMean = (a + b + c) / 3;

		JOptionPane.showMessageDialog(null, "Arithmetic Mean: " + arithmeticMean);

	}

}
