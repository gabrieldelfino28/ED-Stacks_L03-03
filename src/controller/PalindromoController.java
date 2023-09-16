package controller;

import model.AnyStack;

public class PalindromoController {

    AnyStack<String> p = new AnyStack<String>();

    public PalindromoController() {
        super();
    }
    private String SplitString(String input) {
        System.out.println("String original: "+input);
        String[] arr = input.split("");
        return InverteString(arr);
    }

    private String InverteString(String[] arr) {
        for (String i : arr) {
            p.push(i);
        }
        StringBuilder reversed = new StringBuilder();
        try {
            while (p != null) {
                reversed.append(p.pop());
            }
        } catch (Exception ignored) {

        }
        System.out.println("String invertida: "+reversed);
        return reversed.toString();
    }

    public boolean isPalindrome(String input) {
        String reverse = SplitString(input);
        if (input.equals(reverse)) {
            return true;
        }
        return false;
    }
}
