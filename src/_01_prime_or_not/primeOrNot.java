package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog(null, "Please enter a number");
		int prime2 = Integer.parseInt(prime);
		for (int i = 2; i < prime2; i++) {
			if (prime2 % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is NOT Prime!");
				break;

			}
			if (prime2 % i == 1) {
				JOptionPane.showMessageDialog(null, "Your number is Prime!!!");
				break;
			}
		}
	}
}
