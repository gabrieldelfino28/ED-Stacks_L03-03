package view;

import controller.PalindromoController;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = JOptionPane.showInputDialog("Informe um Palindromo");
        PalindromoController p = new PalindromoController();

        System.out.println("É um palindromo? "+p.isPalindrome(input));
    }
}
